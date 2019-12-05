package com.locum.users.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locum.users.model.UsersAddress;

@Repository
public interface UsersAddressRepository extends JpaRepository<UsersAddress, Serializable>{

	
}
