package com.exterro.InventoryManagement1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exterro.InventoryManagement1.entity.CustomerEn;
import com.exterro.InventoryManagement1.entity.ItemsEn;
import com.exterro.InventoryManagement1.service.ItemsService;

@Controller
public class ItemsControl {
	@Autowired
	private ItemsService itemsService;

	@RequestMapping("addItems")
	public String addItems(ItemsEn items) {
		ItemsEn items1 = itemsService.addItems(items);
		return (items1 != null) ? "success.html" : "failure.html";

	}
	@RequestMapping("viewAllItems")
	@ResponseBody
	
	public String viewAllItems() {
		
		String result = "<table><tr><th>ID</th><th>Item Name</th><th>Price</th><th>Quantity</th></tr>";
		for(ItemsEn cus: itemsService.) {
			result += "<tr><td>"+cus.getcID()+"</td><td>"+cus.getcName()+"</td><td>"+cus.getcMobile()+"</td><td>"+cus.getcEmail()+"</td></tr>";
			}
		result += "</table>";
		return result;
	}

	
	@RequestMapping("deleteCustomer")
	@ResponseBody
	public String deleteCustomer(String cID) {
		return customerService.deleteCustomer(cID);
	}
}
