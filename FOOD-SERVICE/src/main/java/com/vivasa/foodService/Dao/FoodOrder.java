package com.vivasa.foodService.Dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="FOOD_ORDER")
public class FoodOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderId;
	
	@Column(name="ORDER_STATUS")
	private String orderStatus;
	
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="PICK_UP_SLOT")
	private Date pickupSlot;
	
	@Column(name="DELIVERY_TYPE")
	private String deliveryType;
	
	
	@Column(name="DELIVERY_CHARGES")
	private BigDecimal deliveryCharges;
	
	@Column(name="DELIVERY_SLOT")
	private Date deliverySlot;
	
	@Column(name="ORDER_TOTAL")
	private BigDecimal orderTotal;
	
	@ManyToOne
	@JoinColumn(name="ADDRESS_ID")
	@JsonManagedReference
	private OrderAddress addressId;

	@ManyToOne
	@JoinColumn(name="USER_ID")
	@JsonManagedReference
	private User user;
	

	@OneToMany(mappedBy="foodOrder")
	@JsonBackReference
	private List<FoodOrderItem> orderItemsList;

	
	@Column(name = "CREATED_ON", updatable=false)
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;
	
	@Column(name="LAST_MODIFIED_ON")
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedOn;
	
	

	public long getOrderId() {
		return orderId;
	}


	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}


	public OrderAddress getAddressId() {
		return addressId;
	}


	public void setAddressId(OrderAddress addressId) {
		this.addressId = addressId;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
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


	public String getDeliveryType() {
		return deliveryType;
	}


	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
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


	public Date getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}


	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}


	public List<FoodOrderItem> getOrderItemsList() {
		return orderItemsList;
	}


	public void setOrderItemsList(List<FoodOrderItem> orderItemsList) {
		this.orderItemsList = orderItemsList;
	}
	
	


}
