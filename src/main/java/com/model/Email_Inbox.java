package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Email_Inbox {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int temp_email_id;
	private String sender;
	private String subject;
	private String messege_body;
	
	@Override
	public String toString() {
		return "Email_Inbox [id=" + id + ", temp_email_id=" + temp_email_id + ", sender=" + sender + ", subject="
				+ subject + ", messege_body=" + messege_body + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTemp_email_id() {
		return temp_email_id;
	}

	public void setTemp_email_id(int temp_email_id) {
		this.temp_email_id = temp_email_id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessege_body() {
		return messege_body;
	}

	public void setMessege_body(String messege_body) {
		this.messege_body = messege_body;
	}
	
}
