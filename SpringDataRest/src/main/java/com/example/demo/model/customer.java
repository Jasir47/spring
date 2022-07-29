package com.example.demo.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class customer {
    
	@Id
	@GeneratedValue
	private int customerId;
	private String customerName;
	private String customerPlace;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPlace() {
		return customerPlace;
	}
	public void setCustomerPlace(String customerPlace) {
		this.customerPlace = customerPlace;
	}
	
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPlace="
				+ customerPlace + "]";
	}
	
	
	
	
}
