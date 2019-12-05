package com.locum.users.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locum.security.JwtGenerator;
import com.locum.users.model.Users;

@RestController
@RequestMapping("/token")
public class TokenController {
	
	private JwtGenerator jwtGenerator;
	
	public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody final Users jwtUser, HttpServletResponse response) {
    	response.setHeader("Token", jwtGenerator.generate(jwtUser));
    	//request.getHeaders().add("Authorization", "Bearer " + jwtGenerator.generate(jwtUser));
    	
        return jwtGenerator.generate(jwtUser);

    }
}