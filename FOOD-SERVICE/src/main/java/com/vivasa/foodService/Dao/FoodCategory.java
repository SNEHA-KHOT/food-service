package com.vivasa.foodService.Dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name="FOOD_CATEGORY")
public class FoodCategory implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long categoryId;

	@Column(name="CATEGORY_DESCRIPTION")
	private String categoryDescription;

	@Column(name="CATEGORY_NAME")
	private String categoryName;

	@Column(name="LAST_MODIFIED_BY")
	private String lastModifiedBy;

	@Column(name="LAST_MODIFIED_ON")
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedOn;

	@Column(name="PRIORITY")
	private Integer priority;

	@Column(name="STATUS")
	private int status;
	
	@Column(name="IMAGE_PATH")
	private String imagePath;
	
	
	@ManyToOne
	@JoinColumn(name="MERCHANT_OUTLET_ID")
	@JsonIgnore
	private MerchantOutlet merchantOutlet;

	
	@OneToMany(mappedBy="foodCategory")
	@JsonBackReference
	private List<FoodItems> foodItems;
	
	/*//bi-directional many-to-one association to TitanFoodCatlInventory
	@OneToMany(mappedBy="foodCategory")
	@JsonBackReference
	private List<TitanFoodCatlInventory> titanFoodCatlInventories;*/
	
	

	
	

}
