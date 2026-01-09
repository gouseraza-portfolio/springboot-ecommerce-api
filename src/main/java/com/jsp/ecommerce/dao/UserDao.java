package com.jsp.ecommerce.dao;

import org.springframework.stereotype.Repository;

import com.jsp.ecommerce.entity.Merchant;
import com.jsp.ecommerce.entity.User;
import com.jsp.ecommerce.repository.MerchantRepository;
import com.jsp.ecommerce.repository.UserRepository;
import com.jsp.ecommerce.repository.UserRigisterRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDao {
	private final UserRepository userRepository;
	private final MerchantRepository merchantRepository;
	private final UserRigisterRepository userRigisterRepository;
	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElseThrow();
	}
	public void save(User user) {
		userRepository.save(user);
	}
	public boolean checkEmailAndMobieDuplicate(String email, Long mobile) {
		return userRepository.existsByEmailOrMobile(email,mobile);
	}

	public void save(Merchant merchant) {
		merchantRepository.save(merchant);
	}
}
