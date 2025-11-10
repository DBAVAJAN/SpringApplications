package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface otprepo  extends JpaRepository<otpdetails,Integer> { 
	public otpdetails findByOtp(int otp);

}
