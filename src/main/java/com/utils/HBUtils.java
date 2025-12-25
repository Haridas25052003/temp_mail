package com.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Email_Inbox;
import com.model.Temp_Mail;

public class HBUtils {
	
	public static SessionFactory sf=new Configuration()
			.setProperties(myProperties())
			.addAnnotatedClass(Temp_Mail.class)
			.addAnnotatedClass(Email_Inbox.class)
			.buildSessionFactory();
	
	private static Properties myProperties() {
		
		 Properties p=new Properties();
		 
		 p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		 p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/tempmaildatabase");
		 p.setProperty("hibernate.connection.username", "root");
		 p.setProperty("hibernate.connection.password", "root123");
		 
		 p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		 p.setProperty("hibernate.hbm2ddl.auto", "update");
		 p.setProperty("hibernate.show_sql", "true");
		 p.setProperty("hibernate.format_sql", "true");
		 
		 return p;
	}

}
