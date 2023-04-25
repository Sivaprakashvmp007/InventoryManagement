package com.exterro.InventoryManagement1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exterro.InventoryManagement1.entity.CustomerEn;

public interface CustomerDao extends JpaRepository<CustomerEn, String> {

}
