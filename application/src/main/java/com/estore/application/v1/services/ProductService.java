package com.estore.application.v1.services;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.estore.application.v1.models.OrderItem;
import com.estore.application.v1.models.Product;

@Service
public interface ProductService {

	public long addToCart(long cartID, long productID);

	public Product requestProduct(Product product);

	public Product viewProductbyID(long productID);

	@NonNull
	Iterable<Product> getAllProducts();
	
	public long removeFromCart(OrderItem item);
	
	public OrderItem getOrderItem(Product product);

}
