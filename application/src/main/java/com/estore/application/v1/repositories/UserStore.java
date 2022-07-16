package com.estore.application.v1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estore.application.v1.models.User;

public interface UserStore extends JpaRepository<User, Long>{

}
