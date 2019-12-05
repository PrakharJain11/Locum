package com.locum.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.locum.users.model.Users;
import com.locum.users.repository.UsersRepository;

@Service
public class UsersService{
	
	@Autowired
	private UsersRepository userRepository;
	
	
	public Users addUser(Users user)
	{
		System.out.println("<------------In Service-------------->"+userRepository);
		
		
		Users b = userRepository.save(user);
		System.out.println(b.name);
		return b;
	}
	
	public Users userLogin(String contactNumber)
	{
		System.out.println("In Service Login"+contactNumber);
		Users l = userRepository.findByContactNumber(contactNumber);
		System.out.println("Service: "+l.contactNumber+ " Password: "+l.password);
		
		return l;
	}

}
