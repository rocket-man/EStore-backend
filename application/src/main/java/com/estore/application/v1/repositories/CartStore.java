package com.estore.application.v1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.estore.application.v1.models.Cart;

public interface CartStore extends CrudRepository<Cart, Long>{

}
