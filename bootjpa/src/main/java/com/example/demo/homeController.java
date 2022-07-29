package com.example.demo;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.customerRepo;
import com.example.demo.model.customer;



@RestController
public class homeController {
   
   @Autowired
   customerRepo repo;
	
   @RequestMapping("/")
   public String func() {
	   
	   return "home.jsp";
   
	}
	
   @PostMapping("/customer")
   public customer addCustomer(@RequestBody customer customer) {
	   
	   repo.save(customer);
	   return customer ;
   }
   
   @GetMapping("/customer") 
   public List<customer> getCustomers() {
	   
	   return repo.findAll();
	
   } 
   
   @RequestMapping("/customer/{customerId}") 
   public Optional<customer> getCustomer(@PathVariable("customerId") int customerId) {
	   
	   return repo.findById(customerId);
	
   }
   
   @SuppressWarnings("deprecation")
   @DeleteMapping("/customer/{customerId}")
   public String deleteCustomer(@PathVariable int customerId) {
	   
	   customer c = repo.getOne(customerId);
	   repo.delete(c);
	   return "deleted";
       
   }
   
   @PutMapping(path="/customer")
   public customer updateCustomer(@RequestBody customer customer) {
	   
	   repo.save(customer);
	   return customer ;
   }
   
   
}
