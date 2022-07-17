package com.estore.application.v1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estore.application.v1.models.OrderItem;
import com.estore.application.v1.models.Product;
import com.estore.application.v1.services.ProductService;

@RestController
@RequestMapping("/eStore")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/viewAll")
	public Iterable<Product> viewAllProducts() {

		return productService.getAllProducts();
	}

	@PostMapping("/addToCart")
	public long addProductToCart(@RequestBody Product product, @RequestParam("CART_ID") String cartID) {
		return productService.addToCart(Long.parseLong(cartID), product.getProductID());
	}

	@PostMapping("/addAnother")
	public String addAnotherProduct(@RequestBody OrderItem item) {
		return "Successfully Added " + String
				.valueOf(productService.addToCart(item.getCartID().getId(), item.getProductID().getProductID()));
	}

	@PostMapping("/removeFromCart")
	public String removeProduct(@RequestBody OrderItem item) {
		return "Successfully Removed Item " + String.valueOf(productService.removeFromCart(item));
	}

	@GetMapping("/getOrderItem")
	public OrderItem getOrderItem(@RequestParam("PRODUCT_ID") String productID) {
		return productService.getOrderItem(productService.viewProductbyID(Long.parseLong(productID)));
	}

}
