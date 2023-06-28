package com.mastek.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mastek.insurance.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {

}
