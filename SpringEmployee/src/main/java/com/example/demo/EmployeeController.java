package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	@GetMapping("/findemployees")
	public List<Employee> getAllEmployees() {
		return empservice.findingAllEmployees();
	}
	
	@GetMapping("/findemployee")
	public Employee getEmployee(@RequestParam int id) {
		return empservice.findEmployee(id);
	}
	
	@PostMapping("/savedata")
	public Employee save(@RequestBody Employee emp) {
		return empservice.addingEmployee(emp);
	}
	@GetMapping("/delethadata/{id}")
	public void delete(@PathVariable int id) {
		empservice.deletingEmployee(id);
	}
}
