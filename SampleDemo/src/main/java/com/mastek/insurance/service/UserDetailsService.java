package com.mastek.insurance.service;

import com.mastek.insurance.model.UserDetails;

public interface UserDetailsService {
	
	
	public UserDetails saveUserDetails(UserDetails userDetails);
	
	public void deleteById(Integer Id);

}
