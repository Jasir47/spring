package com.example.demo;

import  org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Firstproject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Firstproject1Application.class, args);
		firstclass fc = context.getBean(firstclass.class);
		fc.show();
	}

}
