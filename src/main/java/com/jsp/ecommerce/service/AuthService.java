package com.jsp.ecommerce.service;

import java.util.Map;

import com.jsp.ecommerce.dto.LoginDto;
import com.jsp.ecommerce.dto.MerchantDto;

import jakarta.validation.Valid;

public interface AuthService {

	Map<String, Object> login(LoginDto loginDto);

	Map<String, Object> viewUser(String email);

	Map<String, Object> updatePassword(String name, String oldPassword, String newPassword);

	Map<String, Object> registerMerchant(MerchantDto merchantDto);

}
