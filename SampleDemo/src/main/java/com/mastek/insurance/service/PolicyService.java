package com.mastek.insurance.service;

import java.util.Optional;

import com.mastek.insurance.model.PolicyDetails;

public interface PolicyService {
	
	public PolicyDetails savepolicyDetails(PolicyDetails policyDetails);
	
	public Optional<PolicyDetails> getPolicyDetailsById(Integer id);

	

}
