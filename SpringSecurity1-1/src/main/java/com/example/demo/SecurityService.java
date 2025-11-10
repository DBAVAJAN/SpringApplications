package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class SecurityService {
	@Autowired
	SecurityRepo securityrepo;
	
	public credentials Loginpage(String username) {
		
		return  securityrepo.findByUsername(username);
		
		}

}
