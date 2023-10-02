package com.vivasa.foodService.Dao;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="FOOD_ORDER_ITEM")
public class FoodOrderItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderItem;
	
	
	@Column(name="QUANTITY")
	private BigDecimal quantity;

	@Column(name="TOTAL_PRICE")
	private BigDecimal totalPrice;

	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	@JsonManagedReference
	private FoodOrder foodOrder;
	
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	@JsonManagedReference
	private FoodItems foodItem;
	
	@ManyToOne
	@JoinColumn(name="CART_ID")
	@JsonManagedReference
	private FoodCart foodCart;

	public long getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(long orderItem) {
		this.orderItem = orderItem;
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

	public FoodOrder getFoodOrder() {
		return foodOrder;
	}

	public void setFoodOrder(FoodOrder foodOrder) {
		this.foodOrder = foodOrder;
	}

	public FoodItems getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItems foodItem) {
		this.foodItem = foodItem;
	}

	public FoodCart getFoodCart() {
		return foodCart;
	}

	public void setFoodCart(FoodCart foodCart) {
		this.foodCart = foodCart;
	}
	
	

}
