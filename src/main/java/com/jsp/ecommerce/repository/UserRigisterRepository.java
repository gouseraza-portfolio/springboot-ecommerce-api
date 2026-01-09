package com.jsp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce.entity.User;

public interface UserRigisterRepository extends JpaRepository<User, Integer>{

}
