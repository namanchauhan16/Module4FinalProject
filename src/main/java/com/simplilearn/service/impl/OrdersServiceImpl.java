package com.simplilearn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Orders;
import com.simplilearn.repository.OrdersRepository;
import com.simplilearn.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService{

	@Autowired
	OrdersRepository ordersRepository;
	
	@Override
	public void save(Orders orders) {
		ordersRepository.save(orders);
	}

	@Override
	public List<Orders> getOrders() {
		return ordersRepository.findAll();
	}

	@Override
	public List<Orders> findByUserId(long userId) {
		return ordersRepository.findByUserId(userId);
	}

}
