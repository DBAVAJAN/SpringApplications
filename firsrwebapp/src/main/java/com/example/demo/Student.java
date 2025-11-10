package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student {
	
	@GetMapping("/greet")
	@ResponseBody
	String getMessage() {
		return "Hellow world";
	}

}
