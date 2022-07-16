package com.estore.application.v1.services;

import com.estore.application.v1.models.Cart;
import com.estore.application.v1.models.User;

public interface UserService {
	
	public Cart associateCart(long userID);
	
	public User loginUser(User user);
	
	public User registerUser(User user);

}
