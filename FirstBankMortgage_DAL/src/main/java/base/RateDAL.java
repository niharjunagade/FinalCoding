package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import domain.StudentDomainModel;
import util.HibernateUtil;

public class RateDAL {


	public static double getRate(double GivenCreditScore) {
		//FinalExam - please implement		
		// Figure out which row makes sense- return back the 
		// right interest rate from the table based on the given credit score
		
		//FinalExam - obviously change the return value
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		RateDomainModel rateGet = null;		
		
		try {
			tx = session.beginTransaction();	
									
			Query query = session.createQuery("from RateDomainModel where rateId = :id ");
			query.setParameter("id", GivenCreditScore);
			
			List<?> list = query.list();
			rateGet = (RateDomainModel)list.get(0);
			
			tx.commit();
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rateGet.getInterestRate();
	}
	
	

}