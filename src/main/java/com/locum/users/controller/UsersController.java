package com.locum.users.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;*/
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.locum.users.model.Users;
import com.locum.users.service.UsersService;

@RestController
public class UsersController {
	
	/*@RequestMapping("/hi")
	public String sayHi()
	{
		return "Hi";
	}*/
	
	@Autowired
	UsersService userService;
	
	/*@Autowired
	private JdbcUserDetailsManager jdbcUserDetailManager;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	

	@Autowired
	private UserDetailsService userDetailsService;*/
	
	@RequestMapping(method=RequestMethod.POST, value="addUser")
	public Users addUser(@RequestBody @Valid Users user)
	{
		System.out.println("<-------------In Controller-------------->");
		
		//List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		//authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

		
		//String encodedPassword = bCryptPasswordEncoder.encode(user1.getPassword());
		
		//User user = new User(user1.getContact_Number(),encodedPassword,authorities);
		
		//jdbcUserDetailManager.createUser(user);
		//String encodePassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
		//user.setPassword(encodePassword);
		
		Users savedUser = userService.addUser(user);
		
		return savedUser;
	}
	
	/*@RequestMapping(method=RequestMethod.POST)
	public boolean userLogin()
	{
		
	}*/
	
}
