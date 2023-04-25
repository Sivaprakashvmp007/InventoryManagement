package com.exterro.InventoryManagement1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ItemsEn {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String itemId;
	private String itemName;
	private String itemPrice;
	private String itemQuantity;
	
	public ItemsEn() {
		super();
	}
	public ItemsEn(String itemId, String itemName, String itemPrice, String itemQuantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	
	
}
