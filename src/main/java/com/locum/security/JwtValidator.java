/*package com.locum.security;

import org.springframework.stereotype.Component;

import com.locum.users.model.Users;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {
	
	private String secret = "youtube";

    public Users validate(String token) {

        Users jwtUser = null;
        try {
            Claims body = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();

            jwtUser = new Users();

            jwtUser.setName(body.getSubject());
            jwtUser.setID((String) body.get("userId"));
            //jwtUser.setRole((String) body.get("role"));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        return jwtUser;
    }
}
*/