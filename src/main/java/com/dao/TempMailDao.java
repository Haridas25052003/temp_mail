package com.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Temp_Mail;
import com.utils.HBUtils;

public class TempMailDao {
	
	//create
	public void saveTempMail(Temp_Mail tempMail) {
		Session session=HBUtils.sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(tempMail);
		
		tx.commit();
		session.close();
	}

	//Read by ID
	public Temp_Mail getTempMailById(int id) {
		Session session=HBUtils.sf.openSession();
		Temp_Mail mail=session.get(Temp_Mail.class, id);
		session.close();
		return mail;
	}
	
	//Update (active/deactivate)
    public void updateTempMail(Temp_Mail tempMail) {
    	Session session=HBUtils.sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	session.update(tempMail);
    	
    	tx.commit();
    	session.close();
    }
    
    //Delete
    public void deleteTempMail(Temp_Mail tempMail) {
    	Session session=HBUtils.sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	session.delete(tempMail);
    	
    	tx.commit();
    	session.close();
    }
}
