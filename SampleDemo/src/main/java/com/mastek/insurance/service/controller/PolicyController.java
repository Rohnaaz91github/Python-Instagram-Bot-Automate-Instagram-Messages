package com.mastek.insurance.service.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastek.insurance.model.PolicyDetails;
import com.mastek.insurance.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;
	
	@PostMapping("/savePolicyDetails")
	public ResponseEntity<PolicyDetails> savepolicyDetails(@RequestBody PolicyDetails policyDetails){
	
		PolicyDetails policyDetails2 = policyService.savepolicyDetails(policyDetails);
		
		return ResponseEntity.ok().body(policyDetails2);
		
		
		
		
	}

}
