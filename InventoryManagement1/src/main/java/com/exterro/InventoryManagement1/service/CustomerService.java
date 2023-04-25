package com.exterro.InventoryManagement1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exterro.InventoryManagement1.entity.CustomerEn;

@Service
public interface CustomerService {
	public CustomerEn addCustomer(CustomerEn customer);
	public List<CustomerEn> viewAllCustomer();
	
	//public String deleteCustomer(String cID);
	String deleteCustomer(String cID);
	//CustomerEn updateCustomer(CustomerEn customer);
	
}
