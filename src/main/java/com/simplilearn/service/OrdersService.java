package com.simplilearn.service;

import java.util.List;

import com.simplilearn.entity.Orders;

public interface OrdersService {

	void save(Orders orders);
	List<Orders> getOrders();
	List<Orders> findByUserId(long userId);
}
