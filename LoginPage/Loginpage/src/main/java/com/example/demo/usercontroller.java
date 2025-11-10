package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class usercontroller {
	@Autowired
	userservice us;
	@RequestMapping("/")
	public String  login() {
		return "index";
		
	}
	
	@RequestMapping("/register")
	public String register(@RequestParam int empid,
      @RequestParam String username, @RequestParam String password,@RequestParam String email,@RequestParam String role) {
		userdetails ud = new userdetails(empid,username,password,email,role);
		   userdetails ud1 = us.register(ud);
		if (ud1 != null) {
			return "login";
		}
		return "index";
	}
	@RequestMapping("/login")
	public String login2() {
		return "login";
	}
	@RequestMapping("/signin")
	public String loginpage(@RequestParam String username,@RequestParam String password) {
		boolean res = us.login(username,password);
		if (res) {
			
				return "otp";
			} else {
		return "index";
	}
	
	}
	@RequestMapping("/verifyotp")
	public String verifyotp(@RequestParam int otp) {
		
		boolean res = us.verifyOtp(otp);
		if (res) {
			return "result";
		}
		
		return "index";
	}
}
	


