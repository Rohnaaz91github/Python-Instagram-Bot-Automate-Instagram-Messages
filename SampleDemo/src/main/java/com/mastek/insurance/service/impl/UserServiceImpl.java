package com.mastek.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastek.insurance.model.User;
import com.mastek.insurance.repository.UserRepository;
import com.mastek.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {

		User user1 = userRepository.save(user);
		return user1;
	}
}
