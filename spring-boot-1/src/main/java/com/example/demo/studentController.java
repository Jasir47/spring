package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
	
	@GetMapping("/student")
	public student getStudent() {
		student Student =new student("jasir" ,"mk");
		return Student;
	}
    
	
	// returning a list of students 
	@GetMapping("/students")
	public List<student> getStudents(){
		List<student> students  = new ArrayList<>();
		students.add(new student("jasir","mk"));
		students.add(new student("habeeb","dubai"));
		students.add(new student("family","guy"));
		students.add(new student("tom","cruse"));
		students.add(new student("narendra","dump"));
		students.add(new student("great","khali"));
		return students;
	}
	
	
    // handling path variable @PathVariable  API s
	@GetMapping("student/{firstName}/{lastName}")
	public student studentPV(@PathVariable("firstName") String fN ,
			@PathVariable ("lastName") String lN) {
		return new student(fN,lN);
	}
	
	// handling request params using REST API 
	@GetMapping("/student/query")
	public student studentRP(@RequestParam(name = "firstName") String fN,
			@RequestParam(name = "lastName" ) String lN) {
		return new student(fN,lN);
	}
	
	
	
}