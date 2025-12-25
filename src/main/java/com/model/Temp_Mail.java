package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Temp_Mail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String email_address;
	private boolean isActive;
	
	@OneToMany(mappedBy="tempMail")
	private List<Email_Inbox> inboxMesseges;
	
	
	public List<Email_Inbox> getInboxMesseges() {
		return inboxMesseges;
	}
	public void setInboxMesseges(List<Email_Inbox> inboxMesseges) {
		this.inboxMesseges = inboxMesseges;
	}
	@Override
	public String toString() {
		return "Temp_Mail [id=" + id + ", email_address=" + email_address + ", isActive=" + isActive
				+ ", inboxMesseges=" + inboxMesseges + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
