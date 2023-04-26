package com.exterro.InventoryManagement1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exterro.InventoryManagement1.entity.OrdersEn;

public interface OrdersDao extends JpaRepository<OrdersEn, String> {

}
