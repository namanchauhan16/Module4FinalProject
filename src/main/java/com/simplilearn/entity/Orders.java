package com.simplilearn.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {

	@Id
	private long id;
	private long userId;
	private long quantity;
	private String date;
	private long categoryId;
	private long productId;
	private long size;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(long id, long userId, long quantity, String date, long categoryId, long productId, long size) {
		super();
		this.id = id;
		this.userId = userId;
		this.quantity = quantity;
		this.date = date;
		this.categoryId = categoryId;
		this.productId = productId;
		this.size = size;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}
	
	

}