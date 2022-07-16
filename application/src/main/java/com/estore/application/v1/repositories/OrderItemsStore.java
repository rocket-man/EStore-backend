package com.estore.application.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estore.application.v1.models.OrderItem;

public interface OrderItemsStore extends JpaRepository<OrderItem, Long>{

}
