package com.mastek.insurance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mastek.insurance.model.PolicyDetails;

@Repository
public interface PolicyRepository extends JpaRepository<PolicyDetails, Integer> {
	
	public Optional<PolicyDetails> findById(Integer id);
	
	

}
