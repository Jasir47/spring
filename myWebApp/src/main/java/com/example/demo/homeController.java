package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class homeController {
    
	@RequestMapping("home")
	public String func() {
		System.out.println("hiii");
		return "home";
	}
}
