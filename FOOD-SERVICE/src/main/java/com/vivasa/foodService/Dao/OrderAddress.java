package com.vivasa.foodService.Dao;

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
@Table(name="ORDER_ADDRESS")
public class OrderAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long addressId;
	
    @ManyToOne
	@JoinColumn(name="USER_ID")
	@JsonManagedReference
	private User user;
	
    @Column(name = "DELIVERY_FLAG")
	private boolean deliveryFlag;
	
    @Column(name = "DISTRICT")
	private String district;
	
    @Column(name = "LANDMARK")
	private String landmark;
	
    @Column(name = "STREET")
	private String street;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isDeliveryFlag() {
		return deliveryFlag;
	}

	public void setDeliveryFlag(boolean deliveryFlag) {
		this.deliveryFlag = deliveryFlag;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
    
	

}
