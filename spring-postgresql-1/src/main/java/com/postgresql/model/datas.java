package com.postgresql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class datas {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id; 
	

	private String name;
	private String mail;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public datas( long id ,String name, String mail) {
		super();
		
		this.id = id ;
		this.name = name;
		this.mail = mail;
	}
	public datas() {
		super();
	}
	
	

}
