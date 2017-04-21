package com.spring.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.dao.ItemDAO;
import com.spring.security.model.Item;

@Service(value = "itemService")
public class ItemService {
	@Autowired
	private ItemDAO dao;

	public List<Item> getItems() {
		return dao.getItem();
	}
}
