package com.spring.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.model.Item;
import com.spring.security.service.ItemService;

@RestController
public class ItemServiceController {

	@Autowired(required = true)
	@Qualifier(value = "itemService")
	private ItemService itemService;

	@RequestMapping(value = "/getItems", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public List<Item> getItem() {
		return itemService.getItems();
	}
}
