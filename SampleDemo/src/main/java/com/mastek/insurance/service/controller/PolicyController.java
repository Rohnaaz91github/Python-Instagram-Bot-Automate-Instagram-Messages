package com.mastek.insurance.service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/get/{id}")
	public Optional<PolicyDetails> getPolicyDetailsById(@PathVariable ("id") Integer id){
		
		Optional<PolicyDetails> policyDetails4 = policyService.getPolicyDetailsById(id);
		return policyDetails4;
	}

}
