package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService  {
	@Autowired
	EmployeeRepo employeerepo;
	
	public List<Employee> findingAllEmployees() {
		return employeerepo.findAll();
	}
	
	public Employee findEmployee(int id) {
		return employeerepo.findById(id).orElse(null);
	}
	
	public Employee addingEmployee(Employee employe) {
		return employeerepo.save(employe);
	}
	
	public void deletingEmployee(int id) {
		employeerepo.deleteById(id);
	}

}
