package com.vivasa.foodService.Dao;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="FOOD_ITEMS")
public class FoodItems {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long itemId;

	@Column(name="ITEM_DESCRIPTION")
	private String itemDescription;

	@Column(name="ITEM_DETAILS")
	private String itemDetails;

	@Column(name="ITEM_NAME")
	private String itemName;

	@Column(name="ITEM_QUANTITY")
	private BigDecimal itemQuantity;

	@Column(name="LAST_MODIFIED_BY")
	private String lastModifiedBy;

	@Column(name="LAST_MODIFIED_ON")
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedOn;

	@Column(name="PRICE")
	private BigDecimal price;

	@Column(name="STATUS")
	private int status;
	
	@Column(name="QUANTITY")
	private BigDecimal quantity;
	
	//@Column(name="BEST_SELLER")
	//private char bestSeller;
	
	@Column(name="IMAGE_PATH")
	private String imagePath;
	
	
	@Column(name="Priority")
	private Integer priority;
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	@JsonManagedReference
	private FoodCategory foodCategory;

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(BigDecimal itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public FoodCategory getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(FoodCategory foodCategory) {
		this.foodCategory = foodCategory;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	/*@OneToMany(mappedBy="titanFoodCatlInventory")
	@JsonBackReference
	@NotAudited
	private List<TitanOrdersFoodInv> titanOrdersFoodInvs;
	
	@OneToMany(mappedBy="titanFoodCatlInventory")
	@JsonBackReference
	@NotAudited
	private Set<TitanFoodCartInv> titanFoodCartInv;*/



}
