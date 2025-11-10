package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class EmployeeDetails {
	
	
	
	public String empdetails(String FirstName, String LastName) {
		return "Fullname " + FirstName+LastName;
	}

}
