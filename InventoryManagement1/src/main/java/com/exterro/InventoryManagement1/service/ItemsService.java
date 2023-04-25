package com.exterro.InventoryManagement1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exterro.InventoryManagement1.entity.ItemsEn;

@Service
public interface ItemsService {
	public ItemsEn addItems(ItemsEn items);
	public List<ItemsEn> viewAllItems();
	String deleteItem(String itemId);
}