package com.vivasa.foodService.Dto;

import java.math.BigDecimal;


public class FoodCartItemDto {
	
    private long cartItemId;
	private long itemId;
	private BigDecimal quantity;
	private BigDecimal totalPrice;
	private long foodCartId;
	 
	
	public long getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(long cartItemId) {
		this.cartItemId = cartItemId;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public long getFoodCartId() {
		return foodCartId;
	}
	public void setFoodCartId(long foodCartId) {
		this.foodCartId = foodCartId;
	}
	
	

}
