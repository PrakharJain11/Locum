package com.locum.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locum.users.model.UsersAddress;
import com.locum.users.repository.UsersAddressRepository;

@Service
public class UsersAddressService {

	@Autowired
	private UsersAddressRepository userAddressRepository;
	
	public UsersAddress addAddress(UsersAddress usersAddress)
	{
		return userAddressRepository.save(usersAddress);
	}
	
}
