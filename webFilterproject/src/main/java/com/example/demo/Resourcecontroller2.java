package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class Resourcecontroller2 {
	
	@RequestMapping("/2")
	@ResponseBody
	String resource() {
		return "hellow i am empty";
	}

}
