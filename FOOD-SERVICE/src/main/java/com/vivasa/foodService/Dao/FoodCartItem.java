package com.vivasa.foodService.Dao;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name="FOOD_CART_ITEM")
public class FoodCartItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cartItemd;
	
	

	@Column(name="QUANTITY")
	private BigDecimal quantity;

	@Column(name="TOTAL_PRICE")
	private BigDecimal totalPrice;

	@ManyToOne
	@JoinColumn(name="CART_ID")
	@JsonManagedReference
	private FoodCart foodCart;
	
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	@JsonManagedReference
	private FoodItems itemId;

	

	public long getCartItemd() {
		return cartItemd;
	}

	public void setCartItemd(long cartItemd) {
		this.cartItemd = cartItemd;
	}

	public FoodItems getItemId() {
		return itemId;
	}

	public void setItemId(FoodItems itemId) {
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

	public FoodCart getFoodCart() {
		return foodCart;
	}

	public void setFoodCart(FoodCart foodCart) {
		this.foodCart = foodCart;
	}

	/*@ManyToOne
	@JoinColumn(name="ORDER_ID")
	@JsonManagedReference
	private FoodOrder foodOrder;*/

	

	

}
