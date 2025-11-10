package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalciService {
	
	
	public String add(int a, int b) {
		
		return String.valueOf(a+b);
	}
	public String sub(int a, int b) {
		return String.valueOf(a-b);
	}

	public String mul(int a, int b) {
		return String.valueOf(a*b);
	}
	public String div(int a, int b) throws Exception {
		if (b != 0) {
			return String.valueOf(a / b);
			
		} else {
			throw new Exception();
		}
	}


}
