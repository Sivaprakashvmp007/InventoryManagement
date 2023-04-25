package com.exterro.InventoryManagement1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exterro.InventoryManagement1.entity.CustomerEn;
import com.exterro.InventoryManagement1.service.CustomerService;

@Controller
public class CustomerControl {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("index")
	public String getHome() {
		return "index.html";
	}
	@RequestMapping("addCustomer")
	public String addCustomer(CustomerEn customer) {
		CustomerEn customer1=customerService.addCustomer(customer);
		return (customer1 !=null)?"success.html":"failure.html";
	}
	@RequestMapping("viewAllCustomer")
	@ResponseBody
	
	public String viewAllCustomer() {
		//return customerService.viewAllCustomer();
		String result = "<table><tr><th>ID</th><th>Name</th><th>mobile</th><th>emailId</th></tr>";
		for(CustomerEn cus: customerService.viewAllCustomer()) {
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
	/*
	 * @RequestMapping("updateCustomer") public String updateCustomer(CustomerEn
	 * customer) { CustomerEn customer1=customerService.updateCustomer(customer);
	 * return (customer1 !=null)?"success.html":"failure.html"; }
	 */
	
}
