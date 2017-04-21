package com.spring.security.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.security.model.Item;
@Repository
public class ItemDAO {

	public List<Item> getItem() {
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(1244, "MOBILE", 6262736, new Date(), "GRS"));
		items.add(new Item(5745, "COOLER", 73547, new Date(), "PQR"));
		items.add(new Item(7544, "BIKE", 36463473, new Date(), "BJJG"));
		items.add(new Item(5337, "EAR_PHONE", 385264846, new Date(), "GSGSG"));
		return items;
	}
}
