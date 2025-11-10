package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class Resourcecontroller1 {
	
	@RequestMapping("/1")
	@ResponseBody
	String resource(@RequestParam("name") String name) {
		return "hello" + name;
	}
	
	
}
