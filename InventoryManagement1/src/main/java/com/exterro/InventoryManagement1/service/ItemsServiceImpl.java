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
		 
		return itemsDao.findAll();
	}

	@Override
	public String deleteItem(String itemId) {
		ItemsEn items1 = itemsDao.findById(itemId).orElse(null);
		if (items1 != null) {
			itemsDao.delete(items1);

			return "item deleted successfully";
		}
		return "item unavailble";
	}
}
