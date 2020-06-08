package com.venkat.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.model.Order;

@RestController
public class OrderController {

	@RequestMapping(value = "/customerorder", method = RequestMethod.GET)
	public Order customerOrder() {
		Order order = new Order();
		order.setOrderId("TIF567");
		order.setItemName("Dosa");
		order.setItemType("Tiffin");
		order.setCost(40.00);
		return order;
	}

}
