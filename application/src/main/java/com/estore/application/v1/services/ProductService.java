package com.estore.application.v1.services;

import com.estore.application.v1.models.Product;

public interface ProductService {

	public long addToCart(long cartID, long productID);

	public Product requestProduct(Product product);

	public Product viewProductinDetails(long productID);

}
