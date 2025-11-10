package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
@RequestMapping("/greet")
public class Employee {
	
	EmployeeDetails empDetails;
	
	public Employee(EmployeeDetails empDetails) {
		this.empDetails = empDetails;
	}
	@RequestMapping("/")
	public String user() {
		return "input";
	}
     @RequestMapping("/take/details")
	public String takeInput(@RequestParam("Firstname") String Firstname, @RequestParam("Lastname") String Lastname, Model m) {
		
    	 String output = empDetails.empdetails(Firstname,Lastname);
    	 m.addAttribute("FullName", output);
    	 return "result";
    	 
	}
}
