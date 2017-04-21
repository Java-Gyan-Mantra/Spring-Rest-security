package com.spring.security.model;

import java.util.Date;

public class Item {

	private int itemId;

	private String itemName;

	private int price;

	private Date purchaseDate;

	private String userId;

	public Item(int itemId, String itemName, int price, Date purchaseDate,
			String userId) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.purchaseDate = purchaseDate;
		this.userId = userId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
