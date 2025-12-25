package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Temp_Mail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String email_address;
	private boolean isActive;
	@Override
	public String toString() {
		return "Temp_Mail [id=" + id + ", email_address=" + email_address + ", isActive=" + isActive + "]";
	}
	
	

}
