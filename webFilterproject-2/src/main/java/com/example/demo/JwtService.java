package com.example.demo;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtService {
	
	
	private final SecretKey  signingkey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
	
	JwtBuilder jwtGenerator(String username, String role) {
		
		JwtBuilder token = Jwts.builder();
		
		token.setSubject(username);
		token.claim("role", role);
		token.setIssuedAt(new Date());
		token.setExpiration(new Date(System.currentTimeMillis() + 3600000));
		token.signWith(signingkey);
		token.compact();
		
		
		return token;
	}
	
	

}
