package com.exterro.InventoryManagement1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exterro.InventoryManagement1.dao.ItemsDao;
import com.exterro.InventoryManagement1.entity.ItemsEn;

@Service
public class ItemsServiceImpl implements ItemsService{
	@Autowired
	private ItemsDao itemsDao;

	@Override
	public ItemsEn addItems(ItemsEn items) {
		return itemsDao.save(items);
}

	@Override
	public List<ItemsEn> viewAllItems() {
	
	}

	@Override
	public String deleteItem(String itemId) {
		// TODO Auto-generated method stub
		return null;
	}
}
