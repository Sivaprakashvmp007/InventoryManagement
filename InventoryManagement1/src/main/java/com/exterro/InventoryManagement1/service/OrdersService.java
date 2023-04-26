package com.exterro.InventoryManagement1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exterro.InventoryManagement1.entity.OrdersEn;

@Service
public interface OrdersService {
	public OrdersEn placeOrder(OrdersEn orders);

	public List<OrdersEn> viewAllOrders();
}
