package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Email_Inbox {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String sender;
	private String subject;
	private String messege_body;
	
	@ManyToOne
	@JoinColumn(name="temp_email_id")
	private Temp_Mail tempMail;
	
	public Temp_Mail getTempMail() {
		return tempMail;
	}

	public void setTempMail(Temp_Mail tempMail) {
		this.tempMail = tempMail;
	}

	@Override
	public String toString() {
		return "Email_Inbox [id=" + id + ", sender=" + sender + ", subject=" + subject + ", messege_body="
				+ messege_body + ", tempMail=" + tempMail + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
