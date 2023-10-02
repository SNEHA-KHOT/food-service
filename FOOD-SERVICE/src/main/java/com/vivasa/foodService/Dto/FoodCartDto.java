package com.vivasa.foodService.Dto;

import java.math.BigDecimal;
import java.util.List;



public class FoodCartDto {
	
    private long cartId;
	private long userId;
	private long outletId;
	private List<FoodCartItemDto> foodCartItemList;
	private BigDecimal cartTotal;
	
	
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getOutletId() {
		return outletId;
	}
	public void setOutletId(long outletId) {
		this.outletId = outletId;
	}
	public List<FoodCartItemDto> getFoodCartItemList() {
		return foodCartItemList;
	}
	public void setFoodCartItemList(List<FoodCartItemDto> foodCartItemList) {
		this.foodCartItemList = foodCartItemList;
	}
	public BigDecimal getCartTotal() {
		return cartTotal;
	}
	public void setCartTotal(BigDecimal cartTotal) {
		this.cartTotal = cartTotal;
	}
	
	

}
