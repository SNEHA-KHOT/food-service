package com.vivasa.foodService.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.vivasa.foodService.Dao.FoodCart;
import com.vivasa.foodService.Dao.FoodCartItem;
import com.vivasa.foodService.Dao.FoodItems;
import com.vivasa.foodService.Dao.FoodOrder;
import com.vivasa.foodService.Dao.FoodOrderItem;
import com.vivasa.foodService.Dao.MerchantOutlet;
import com.vivasa.foodService.Dao.OrderAddress;
import com.vivasa.foodService.Dao.User;
import com.vivasa.foodService.Dto.FoodCartDto;
import com.vivasa.foodService.Dto.FoodCartItemDto;
import com.vivasa.foodService.Dto.FoodOrderDto;
import com.vivasa.foodService.Repository.FoodCartItemRepo;
import com.vivasa.foodService.Repository.FoodCartRepo;
import com.vivasa.foodService.Repository.FoodOrderItemRepo;
import com.vivasa.foodService.Repository.FoodOrderRepo;
import com.vivasa.foodService.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	FoodCartRepo foodCartRepo;
	
	@Autowired
	FoodCartItemRepo foodCartItemRepo;

	@Autowired
	FoodOrderItemRepo foodOrderItemRepo;
	
	@Autowired
	FoodOrderRepo foodOrderRepo;
	
	@Override
	public Object addCart(FoodCartDto foodCartDto) {
		
		FoodCart result = new FoodCart();//DAO
		
		result.setCartTotal(foodCartDto.getCartTotal());
		
		User user =new User();
		user.setUserId(foodCartDto.getUserId());
		result.setUser(user);
		
		MerchantOutlet merchantOutlet = new MerchantOutlet();
		merchantOutlet.setOutletId(foodCartDto.getOutletId());
		result.setMerchantOutlet(merchantOutlet);
		
		foodCartRepo.save(result);
		
		List<FoodCartItemDto> fcitemDtoList =foodCartDto.getFoodCartItemList();
		List<FoodCartItem> fcItemList = new ArrayList<FoodCartItem>();
		
		if( ! fcitemDtoList.isEmpty()) {
			
			fcitemDtoList.forEach((fcIDto)->{
			
			
			FoodCartItem foodCartItem = new FoodCartItem ();
			
			FoodItems foodItems = new FoodItems();
			foodItems.setItemId(fcIDto.getItemId());
			foodCartItem.setItemId(foodItems);
			
			foodCartItem.setQuantity(fcIDto.getQuantity());
			foodCartItem.setTotalPrice(fcIDto.getTotalPrice());
			
			foodCartItem.setFoodCart(result);
			
			foodCartItemRepo.save(foodCartItem);
			fcItemList.add(foodCartItem);
			
			
			
		});
			}
		result.setFoodCartItemList(fcItemList);
		
		//Return
		FoodCart foodCart=foodCartRepo.findById(result.getCartId());
		FoodCartDto returnFCI = new FoodCartDto();
		
		returnFCI.setCartId(foodCart.getCartId());
		returnFCI.setCartTotal(foodCart.getCartTotal());
		returnFCI.setOutletId(foodCart.getMerchantOutlet().getOutletId());
		returnFCI.setUserId(foodCart.getUser().getUserId());
		
		List<FoodCartItem> cartItems =foodCart.getFoodCartItemList();
		List<FoodCartItemDto> cIDtoList = new ArrayList<>();
		cartItems.forEach((cItem)->{
			
			FoodCartItemDto fcimDto = new FoodCartItemDto();
			fcimDto.setCartItemId(cItem.getCartItemd());
			fcimDto.setFoodCartId(cItem.getFoodCart().getCartId());
			fcimDto.setItemId(cItem.getItemId().getItemId());
			fcimDto.setQuantity(cItem.getQuantity());
			fcimDto.setTotalPrice(cItem.getTotalPrice());
			
			cIDtoList.add(fcimDto);
			
			
		});
		returnFCI.setFoodCartItemList(cIDtoList);
		
		return returnFCI;
		}

	

	
	
	@Override
	public MultiValueMap<String, String> orderPlacement(FoodOrderDto foodOrderDto) {
		
		FoodOrder fOrder = new FoodOrder();
		
		OrderAddress oAddress = new OrderAddress();
		oAddress.setAddressId(foodOrderDto.getAddressId());
		fOrder.setAddressId(oAddress );
		
		User user = new User();
		user.setUserId(foodOrderDto.getUserId());
		fOrder.setUser(user);
		
		fOrder.setDeliveryCharges(foodOrderDto.getDeliveryCharges());
		fOrder.setPickupSlot(foodOrderDto.getPickupSlot());
		fOrder.setDeliverySlot(foodOrderDto.getDeliverySlot());
		fOrder.setDeliveryType("faster shipping");
	
		fOrder.setOrderStatus("Active");
		
		fOrder.setTransactionId("12345677");
		fOrder.setOrderTotal(foodOrderDto.getOrderTotal());
		
		FoodOrder order =foodOrderRepo.save(fOrder);
		
		List<FoodOrderItem> fiIsList = new ArrayList<>();
		List<FoodCartItem> fcItms=foodCartItemRepo.findByFoodCartCartId(foodOrderDto.getCartId());
		fcItms.forEach((fcItm)->{
			
			FoodOrderItem foodOrderItem = new FoodOrderItem();
			
			//FoodOrder FoodOrder1=new FoodOrder();
			foodOrderItem.setFoodOrder(order);
			
			FoodItems foodItem=new FoodItems();
			foodItem.setItemId(fcItm.getItemId().getItemId());
			
			//foodItem.setBestSeller('N');
			foodOrderItem.setFoodItem(foodItem);
			
			foodOrderItem.setQuantity(fcItm.getQuantity());
			foodOrderItem.setTotalPrice(fcItm.getTotalPrice());
			
			FoodCart foodCart = new FoodCart();
			foodCart.setCartId(fcItm.getFoodCart().getCartId());
			foodOrderItem.setFoodCart(foodCart);
			
			foodOrderItemRepo.save(foodOrderItem);
			
			fiIsList.add(foodOrderItem);
			
		});
	
		fOrder.setOrderItemsList(fiIsList);
		//foodOrderRepo
		//foodOrderRepo.save(fOrder);
		return null;
	}
	
	

}
