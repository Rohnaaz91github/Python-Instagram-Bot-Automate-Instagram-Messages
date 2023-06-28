package com.mastek.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastek.insurance.model.UserDetails;
import com.mastek.insurance.repository.UserDetailsRepository;
import com.mastek.insurance.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails saveUserDetails(UserDetails userDetails) {
		UserDetails userDetails1 = userDetailsRepository.save(userDetails);
		return userDetails1;
	}
	
	

}
