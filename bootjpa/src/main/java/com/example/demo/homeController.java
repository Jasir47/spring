package com.example.demo;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.customerRepo;
import com.example.demo.model.customer;



@Controller
public class homeController {
   
   @Autowired
   customerRepo repo;
	
   @RequestMapping("/")
   public String func() {
	   
	   return "home.jsp";
   
	}
	
   @RequestMapping("/addCustomer")
   public String addCustomer(customer customer) {
	   
	   repo.save(customer);
	   return "home.jsp";
   }
   
   @RequestMapping("/customer") 
   @ResponseBody
   public List<customer> getCustomers() {
	   
	   return repo.findAll();
	
   } 
   
   @RequestMapping("/customer/{customerId}") 
   @ResponseBody
   public Optional<customer> getCustomer(@PathVariable("customerId") int customerId) {
	   
	   return repo.findById(customerId);
	
   }
}
