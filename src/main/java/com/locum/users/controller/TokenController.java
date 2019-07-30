/*package com.locum.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locum.security.JwtGenerator;

@RestController
@RequestMapping("/token")
public class TokenController {
	
	private TokenController jwtGenerator;
	
	@PostMapping
	public String generate(@PathVariable final String username)
	{
		//JwtGenerator jwtGenerator = new JwtGenerator();
		return jwtGenerator.generate(username);
	}

	public TokenController(TokenController jwtGenerator) {
		this.jwtGenerator = jwtGenerator;
		// TODO Auto-generated constructor stub
	}
}
*/