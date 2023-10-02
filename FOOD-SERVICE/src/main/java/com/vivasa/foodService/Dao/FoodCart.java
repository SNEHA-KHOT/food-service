package com.vivasa.foodService.Dao;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="FOOD_CART")
public class FoodCart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cartId;
	
	@Column(name="CART_TOTAL")
	private BigDecimal cartTotal;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	@JsonManagedReference
	private User user;

	
	@ManyToOne
	@JoinColumn(name="OUTLET_ID")
	@JsonManagedReference
	private MerchantOutlet merchantOutlet;
	
	@OneToMany(mappedBy="foodCart")
	@JsonBackReference
	private List<FoodCartItem> foodCartItemList;


	
	
	
	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public BigDecimal getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(BigDecimal cartTotal) {
		this.cartTotal = cartTotal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	


	public MerchantOutlet getMerchantOutlet() {
		return merchantOutlet;
	}

	public void setMerchantOutlet(MerchantOutlet merchantOutlet) {
		this.merchantOutlet = merchantOutlet;
	}

	public List<FoodCartItem> getFoodCartItemList() {
		return foodCartItemList;
	}

	public void setFoodCartItemList(List<FoodCartItem> foodCartItemList) {
		this.foodCartItemList = foodCartItemList;
	}
	
	
	

}
