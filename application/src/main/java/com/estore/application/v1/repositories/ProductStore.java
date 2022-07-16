package com.estore.application.v1.repositories;

import org.springframework.data.repository.CrudRepository;

import com.estore.application.v1.models.Product;

public interface ProductStore extends CrudRepository<Product, Long> {

}
