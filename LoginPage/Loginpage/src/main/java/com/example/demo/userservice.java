package com.example.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class userservice {
	@Autowired
	userrepo ur;
	@Autowired
	otprepo or;
	@Autowired
	MailSender ms;
	
	public userdetails register(userdetails user) {
		return ur.save(user);
	}
	public boolean login(String name,String password) {
		userdetails ud1 = ur.findByUsername(name); 
		if (ud1 != null) {
			if (ud1.username.equals(name)&& ud1.password.equals(password)) {
				
				int otp = new Random().nextInt(100000,999999);
			     otpdetails od =	new otpdetails(otp,ud1.empid);
			    otpdetails otpdetails1 =  or.save(od);
			    
			  SimpleMailMessage message =   new SimpleMailMessage();
			  message.setTo(ud1.email);
			  message.setSubject("otp code");
			  message.setText("your otp code is " + otp);
			    
			    ms.send(message);
			    
				return true;
			}
			return false;
		}
		return false;
	}
	
	boolean verifyOtp(int otp) {
	    otpdetails od =  or.findByOtp(otp);
	    
	    if (od != null) {
	    	
	    		return true;
	    	}
	    	return false;
	
	}

}
