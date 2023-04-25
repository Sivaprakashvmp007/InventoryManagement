package com.exterro.InventoryManagement1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CustomerEn {
	@Id
	private String cID;
	private String cName;
	private String cMobile;
	private String cEmail;
	public CustomerEn() {
		super();
	}
	public CustomerEn(String cID, String cName, String cMobile, String cEmail) {
		super();
		this.cID = cID;
		this.cName = cName;
		this.cMobile = cMobile;
		this.cEmail = cEmail;
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
	public String getcMobile() {
		return cMobile;
	}
	public void setcMobile(String cMobile) {
		this.cMobile = cMobile;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	@Override
	public String toString() {
		return "CustomerEn [cID=" + cID + ", cName=" + cName + ", cMobile=" + cMobile + ", cEmail=" + cEmail + "]";
	}
	
}
