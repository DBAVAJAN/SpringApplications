package com.example.demo;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@WebFilter(urlPatterns = "/api")
public class WebFilterApp implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String url = req.getRequestURI();
		
		if (url.equals("/api/1")) {
			String name = req.getParameter("name");
			if (name.length() != 0) {
				chain.doFilter(request, response);
			}
		} else {
			System.out.println("performing validation and sending request");
			req.setAttribute("checked", "true");
			chain.doFilter(request, response);
		}
		
		
	}
	
	
	
	
	

}
