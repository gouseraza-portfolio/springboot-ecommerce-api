package com.jsp.ecommerce.service;

import java.util.Map;

public interface CustomerService {

	Map<String, Object> getProducts(int page, int size, String sort, boolean desc, String name, String category,
			String lower, String higher);

	Map<String, Object> addToCart(Long id, String email, String size);

	Map<String, Object> viewCart(String email);

	Map<String, Object> removeFromCart(Long id, String email);

	Map<String, Object> buyFromCart(String email, String address);

	Map<String, Object> confirmPayment(Long id, String razorpay_payment_id);

	Map<String, Object> getAllOrders(String email);

}
