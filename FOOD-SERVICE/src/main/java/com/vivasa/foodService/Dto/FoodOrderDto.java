package com.vivasa.foodService.Dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class FoodOrderDto {
	
    private long orderId;
	private String orderStatus;
	private String transactionId;
	private Date pickupSlot;
	//private String deliveryType;
	private BigDecimal deliveryCharges;
	private Date deliverySlot;
	private BigDecimal orderTotal;
	private long itemId;
	private long addressId;
	private long userId;
	private long cartId;
	private List<FoodOrderItemDto> orderItemsDtoList;
	
	
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Date getPickupSlot() {
		return pickupSlot;
	}
	public void setPickupSlot(Date pickupSlot) {
		this.pickupSlot = pickupSlot;
	}
	
	public BigDecimal getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(BigDecimal deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	public Date getDeliverySlot() {
		return deliverySlot;
	}
	public void setDeliverySlot(Date deliverySlot) {
		this.deliverySlot = deliverySlot;
	}
	public BigDecimal getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public List<FoodOrderItemDto> getOrderItemsDtoList() {
		return orderItemsDtoList;
	}
	public void setOrderItemsDtoList(List<FoodOrderItemDto> orderItemsDtoList) {
		this.orderItemsDtoList = orderItemsDtoList;
	}
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
	
	
	

}
