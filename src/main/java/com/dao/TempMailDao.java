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

}
