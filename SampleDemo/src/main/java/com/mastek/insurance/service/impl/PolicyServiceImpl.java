package com.mastek.insurance.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastek.insurance.model.PolicyDetails;
import com.mastek.insurance.repository.PolicyRepository;
import com.mastek.insurance.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public PolicyDetails savepolicyDetails(PolicyDetails policyDetails) {

		PolicyDetails policyDetails1 = policyRepository.save(policyDetails);
		
		return policyDetails1;
	}

	@Override
	public Optional<PolicyDetails> getPolicyDetailsById(Integer id) {
		Optional<PolicyDetails> policyDetails3 =  policyRepository.findById(id);
		return policyDetails3;
	}

}
