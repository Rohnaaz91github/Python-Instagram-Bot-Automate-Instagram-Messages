package com.mastek.insurance.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.insurance.model.UserDetails;
import com.mastek.insurance.service.UserDetailsService;

@RestController
public class UserDetailsController {
	
	@Autowired
	private UserDetailsService userDetailsService;

	@PostMapping("/userDetails")
	public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails){
		
		UserDetails userDetails2 = userDetailsService.saveUserDetails(userDetails);
		return ResponseEntity.ok().body(userDetails2);
	}
	
	@DeleteMapping("/deleteUserDetails/{id}")
	public void deleteUserDetailsById(@PathVariable("id")Integer id) {
		
		userDetailsService.deleteById(id);
		
	}
}
