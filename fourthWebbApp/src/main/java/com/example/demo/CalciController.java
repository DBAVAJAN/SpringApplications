package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/calci")
public class CalciController {
	
	CalciService calciservice;
	
	public CalciController(CalciService calciservice) {
		this.calciservice = calciservice;
	}
	
	@PostMapping("/calculate")
public String calciservice(@RequestParam("num1") int num1, @RequestParam("num2") int num2, @RequestParam("operation") String op,Model m) {
	
	String output = null;
	switch(op) {
	case "add" -> output = calciservice.add(num1,num2);
	case "sub" -> output = calciservice.sub(num1,num2);
	case "mul" -> output = calciservice.mul(num1,num2);
	
	case "div" ->  {
	try {
		output = calciservice.div(num1,num2);
	}  catch (Exception e) {
		m.addAttribute("num1", num1);
		m.addAttribute("num2", num2);
		m.addAttribute("operation", op);
		m.addAttribute("result", output);
		m.addAttribute("error","the num2 value have an ArithMatic Exception");
		
	}
	
	
	}
	}
	m.addAttribute("n1", num1);
	m.addAttribute("n2", num2);
	m.addAttribute("op1", op);
	m.addAttribute("result", output);
	return "result";
	}
	@RequestMapping("/home")
	public String display() {
		return"index";
	}
	
	
}

