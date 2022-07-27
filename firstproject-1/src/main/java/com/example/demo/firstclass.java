package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component 
public class firstclass {
	
	private int i;
	private String name;
	@Autowired
	private secondClass sc;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public secondClass getSc() {
		return sc;
	}

	public void setSc(secondClass sc) {
		this.sc = sc;
	}

	public void show() {
		System.out.println("firstClass");
        sc.show2();
	}

}
