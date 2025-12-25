package temp_mail.temp_mail;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Email_Inbox;
import com.model.Temp_Mail;
import com.utils.HBUtils;

/**
 * 
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session=HBUtils.sf.openSession();
        Transaction tx=session.beginTransaction();
        
        Temp_Mail tm= new Temp_Mail();
        
        Email_Inbox e=new Email_Inbox();
        
        tx.commit();
        session.close();
    }
}
