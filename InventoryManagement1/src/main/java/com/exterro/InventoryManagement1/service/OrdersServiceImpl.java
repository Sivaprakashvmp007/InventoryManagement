package com.exterro.InventoryManagement1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exterro.InventoryManagement1.dao.OrdersDao;
import com.exterro.InventoryManagement1.entity.OrdersEn;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersDao ordersDao;

	@Override
	public OrdersEn placeOrder(OrdersEn orders) {
	
			return ordersDao.save(orders);
	}

	@Override
	public List<OrdersEn> viewAllOrders() {
		
		return ordersDao.findAll();
	}
	}


