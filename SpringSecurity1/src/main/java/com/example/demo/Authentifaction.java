package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Authentifaction {
	
	@RequestMapping("/secure")
	@ResponseBody
	String Resources() {
		return "You have entered right username and password";
	}
	
	

}
