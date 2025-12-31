package com.jsp.ecommerce.entity;
import jakarta.persistence.Id;

import com.jsp.ecommerce.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Data
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer Id;
@Column(nullable = false)
 private String username;
@Column(nullable = false,unique = true)
 private String email;
@Column(nullable = false,unique = true)
 private Long mobile;
@Column(nullable = false)
 private String password;
 @Enumerated(EnumType.STRING)
 @Column(nullable = false)
 private UserRole role;
 private boolean isActive;

}
