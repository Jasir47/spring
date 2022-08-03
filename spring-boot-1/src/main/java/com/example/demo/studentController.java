package com.example.demo;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
	
	@GetMapping("/student")
	public student getStudent() {
		student Student =new student("jasir" ,"mk");
		return Student;
	}
    
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
}