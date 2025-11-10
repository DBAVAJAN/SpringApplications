package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class userdetails {
	@Id
	int empid;
	@Column
	String username;
	@Column
	String password;
	@Column
	String email;
	@Column
	String role;
	public userdetails(int empid, String username, String password, String email, String role) {
		super();
		this.empid = empid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	public userdetails(String username, String password, String email, String role) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	public userdetails() {
		super();
	}
	public userdetails(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public userdetails(int empid, String username, String password, String email) {
		super();
		this.empid = empid;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
	
	
	
	
	

}
