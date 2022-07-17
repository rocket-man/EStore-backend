package com.estore.application.v1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estore.application.v1.models.OrderItem;
import com.estore.application.v1.models.Product;
import com.estore.application.v1.repositories.OrderItemsStore;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	OrderItemsStore orderStore;
	
	OrderItem item= new OrderItem();
	
	@GetMapping("/getOrderItems")
	public Iterable<OrderItem> getOrderItemforCart(@RequestBody Product product, @RequestParam("CART_ID") String cartID) {
		return null;
	}

}
