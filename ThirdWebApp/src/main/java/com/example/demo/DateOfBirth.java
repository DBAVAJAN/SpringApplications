package com.example.demo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/api")
public class DateOfBirth {
	
	@RequestMapping("/user/future/{birthyear}")
	@ResponseBody
	public int addYear(@PathVariable int birthyear ) {
		return birthyear + 10;
	}
	@RequestMapping("/name")
	public String personName(@RequestBody Map<String,String> input, Model m) {
		String output = "FullName: " +  input.get("FirstName")+input.get("LastName");
		m.addAttribute("FullName", output);
		return "value";
		}
       @RequestMapping("/marks/tm/ns")
       @ResponseBody
	  public int totalMarks(@RequestParam("tm") int marks, @RequestParam("ns") int subjects) {
		  
		  int percentage = marks % (subjects * 100);
		  return percentage;
	  }
	  
	
}



