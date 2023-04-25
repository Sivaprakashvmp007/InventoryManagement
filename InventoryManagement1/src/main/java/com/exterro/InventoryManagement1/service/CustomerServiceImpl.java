package com.exterro.InventoryManagement1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exterro.InventoryManagement1.dao.CustomerDao;
import com.exterro.InventoryManagement1.entity.CustomerEn;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	public CustomerEn addCustomer(CustomerEn customer) {
		return customerDao.save(customer);
	}

	@Override
	public List<CustomerEn> viewAllCustomer() {
		
		return customerDao.findAll();
	}

	@Override
	public String deleteCustomer(String cID) {
		CustomerEn customer1 = customerDao.findById(cID).orElse(null);
		if (customer1 != null) {
			customerDao.delete(customer1);

			return "customer deleted successfully";
		}
		return "customer unavailble";
	}

	/*
	 * @Override public CustomerEn updateCustomer(CustomerEn customer) { CustomerEn
	 * customer1 = customerDao.findById(cID).orElse(null); if (customer1 != null) {
	 * customerDao.delete(customer1); } return customerDao.save(customer1); }
	 */
}