package com.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringPostgresqlApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringPostgresqlApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	     String sql = "INSERT INTO datas (name,mail) VALUES ("
	     		+ "'jasir mk' , 'jasir.mk@mail' )" ;
	     int rows = jdbcTemplate.update(sql);
	     if (rows>0) {
	    	 System.out.println("new row added");
	     }
	} 

}
