/*package com.locum.security;


import org.springframework.stereotype.Component;

import com.locum.users.model.Users;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {
	public String generate(Users jwtUser) {


        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getContact_Number());
        claims.put("userId", String.valueOf(jwtUser.getID()));
        //claims.put("role", jwtUser.getRole());


        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, "youtube")
                .compact();
    }
}
*/