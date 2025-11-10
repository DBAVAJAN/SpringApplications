package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class otpdetails {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	@Column
	 int otp;
	@Column
	 int empid;
	public otpdetails(int otp, int empid) {
		super();
		this.otp = otp;
		this.empid = empid;
	}
	public otpdetails() {
		super();
	}
	public otpdetails(int id, int otp, int empid) {
		super();
		this.id = id;
		this.otp = otp;
		this.empid = empid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	 

}
