package com.exterro.InventoryManagement1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exterro.InventoryManagement1.entity.ItemsEn;

public interface ItemsDao extends JpaRepository<ItemsEn, String> {

}
