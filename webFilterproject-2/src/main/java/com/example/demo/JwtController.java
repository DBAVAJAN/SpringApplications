package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;


@RestController
@RequestMapping("/api")
public class JwtController {
	
	
	@Autowired
	JwtService jwts;
	
	@RequestMapping("/jwt")
     JwtBuilder jwtTokenGenerator(@RequestParam String username, @RequestParam String role) {
		
		  JwtBuilder token =  jwts.jwtGenerator(username,role);
		
		return token;
		
	}
	

}
