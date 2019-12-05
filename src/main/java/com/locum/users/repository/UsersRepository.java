package com.locum.users.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locum.users.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Serializable> {
	
	
	Users findByContactNumber(String number);
	Users findOneByname(String name);
	
	
}
