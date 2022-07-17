package com.estore.application.v1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import com.estore.application.v1.models.Cart;
import com.estore.application.v1.models.OrderItem;
import com.estore.application.v1.models.Product;
import com.estore.application.v1.repositories.CartStore;
import com.estore.application.v1.repositories.OrderItemsStore;
import com.estore.application.v1.repositories.ProductStore;

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductStore productStore;
	@Autowired
	OrderItemsStore itemStore;
	@Autowired
	CartStore cartStore;

	OrderItem item = new OrderItem();
	Cart cart = new Cart();
	Product product = new Product();
	
	@Override
	public Iterable<Product> getAllProducts() {
		return productStore.findAll();
	}

	@Override
	public long addToCart(long cartID, long productID){
		// Create order-item
		cart = cartStore.findById(cartID).orElseThrow(() -> new ResourceNotFoundException("Cart not found"));
		product = productStore.findById(productID)
				.orElseThrow(() -> new ResourceNotFoundException("Product not valid"));
		item.setCartID(cart);
		item.setProductID(product);

		//item.setOrderItemCount(item.getOrderItemCount() + 1);
		// TODO if(item.getOrderItemCount()>5) throw error
		
		item.setCostPerItem(product.getProductCost() * item.getOrderItemCount());

		itemStore.save(item);

		return item.getOrderItemID();
	}
	
	
	public long removeFromCart(OrderItem item) {
		long id = item.getOrderItemID();
		itemStore.delete(item);
		return id;
	}

	@Override
	public Product requestProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product viewProductbyID(long productID) {
		return productStore.findById(productID).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
	}

	@Override
	public OrderItem getOrderItem(Product product) {
		item.setProductID(product);
		return itemStore.findById(item.getOrderItemID())
		.orElseThrow(()-> new ResourceNotFoundException("Cart not found"));
	}




}
