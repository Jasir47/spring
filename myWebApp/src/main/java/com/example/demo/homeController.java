package com.example.demo;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class homeController {
    
	@RequestMapping("home")
	public String func(HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		
		String name = req.getParameter("name");
		System.out.println("hiii "+name);
		
		session.setAttribute("name",name);
		return "home";
	}
}
