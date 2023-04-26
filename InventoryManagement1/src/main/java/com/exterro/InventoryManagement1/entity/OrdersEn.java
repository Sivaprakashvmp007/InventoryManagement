package com.exterro.InventoryManagement1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OrdersEn {
	@Id
	private String orderId;
	private String cID;
	private String cName;
	private String itemId;
	private String itemName;
	public OrdersEn() {
		super();
	}
	public OrdersEn(String orderId, String cID, String cName, String itemId, String itemName) {
		super();
		this.orderId = orderId;
		this.cID = cID;
		this.cName = cName;
		this.itemId = itemId;
		this.itemName = itemName;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getcID() {
		return cID;
	}
	public void setcID(String cID) {
		this.cID = cID;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
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
	@Override
	public String toString() {
		return "OrdersEn [orderId=" + orderId + ", cID=" + cID + ", cName=" + cName + ", itemId=" + itemId
				+ ", itemName=" + itemName + "]";
	}

}
