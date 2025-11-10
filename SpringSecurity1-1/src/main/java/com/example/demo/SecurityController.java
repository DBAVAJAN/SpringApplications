package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SecurityController {
	@Autowired
	SecurityService securityservice;
	@PostMapping("/enter")
	public String LoginPage(@RequestBody UserDetails ud,Model m) {
		String username1 = ud.username;
		String password = ud.password;

	    credentials output = securityservice.Loginpage(username1);
	    m.addAttribute("output",output);
	    m.addAttribute("username",username1);
	if (output != null) 
		if (output.username.equals(username1) && output.password.equals(password)) 
			if (output.role.equals("admin")) {
				m.addAttribute("output",output);
				return "admin";
			} else {
				return "user";
			}
	return "user";
	}
}
