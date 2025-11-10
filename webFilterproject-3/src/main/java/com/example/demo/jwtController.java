package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
@RestController
@RequestMapping("/api")
public class jwtController {
	
	@Autowired
	jwtService jwt;
	
	@RequestMapping("/")
	String jwttokenGenerator(@RequestParam String username, @RequestParam String role, HttpServletResponse response) {
		 
		
		
		String token =   jwt.jwts(username,role);
		
		Cookie cookie = new Cookie("token",token);
		cookie.setHttpOnly(true);
		cookie.setSecure(false);
		cookie.setPath("/");
		cookie.setDomain("localhost");
		response.addCookie(cookie);
		return "token is added as a cookie";
	}

}
