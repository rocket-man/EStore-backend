package com.estore.application.v1.services;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.estore.application.v1.models.Cart;
import com.estore.application.v1.models.OrderItem;

public interface CartService {

	public Cart viewCart(long cartID, long userID);

	public Cart saveCart(long cartID, long userID);

	public long deleteSavedCart(long cartID, long userID);

	public ResponseEntity<Map<String, String>> addToCartwithResponse();

	public OrderItem updateCart(long cartID, long productID);

	public OrderItem deleteFromCart(long cartID, long productID);

}
