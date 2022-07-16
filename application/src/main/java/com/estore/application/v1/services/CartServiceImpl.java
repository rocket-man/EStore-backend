package com.estore.application.v1.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.estore.application.v1.models.Cart;
import com.estore.application.v1.models.OrderItem;
import com.estore.application.v1.models.Product;
import com.estore.application.v1.models.User;

public class CartServiceImpl implements CartService{
	
	@Autowired
	public User user;
	public Product product;
	public OrderItem orderItem;

	@Override
	public Cart viewCart(long cartID, long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart saveCart(long cartID, long userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long deleteSavedCart(long cartID, long userID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResponseEntity<Map<String, String>> addToCartwithResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem updateCart(long cartID, long productID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem deleteFromCart(long cartID, long productID) {
		// TODO Auto-generated method stub
		return null;
	}

}
