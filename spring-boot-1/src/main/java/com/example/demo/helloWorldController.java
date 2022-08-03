package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class helloWorldController {
   
	
	@GetMapping("/")
	public String helloWorld() {
		
		return "hello world!";
	}
	
}
