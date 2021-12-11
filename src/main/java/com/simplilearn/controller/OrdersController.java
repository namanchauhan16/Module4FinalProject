package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Orders;
import com.simplilearn.service.OrdersService;

@RestController
@RequestMapping("/public")
public class OrdersController {
	
	@Autowired
	OrdersService ordersService;

	@GetMapping("/orders")
	public List<Orders> listOrders() {
		return ordersService.getOrders();
	}
	
	@GetMapping("/orders/{userId}")
	public List<Orders> searchOrderByUserId(@PathVariable("userId")Long userId) {
		return ordersService.findByUserId(userId);
	}
	
	@PostMapping("/orders")
	public void addOrder(@RequestBody Orders orders) {
		ordersService.save(orders);
	}
}
