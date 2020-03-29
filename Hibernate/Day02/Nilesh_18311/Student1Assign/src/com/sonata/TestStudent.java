package com.sonata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class TestStudent {

	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session sess = factory.openSession();
		sess.beginTransaction();
		Criteria c = sess.createCriteria(StudentInfo.class);
		/*ProjectionList pl = Projections.projectionList();
		pl.add(Projections.max("Marks"));
		c.setProjection(pl);
		c.addOrder(Order.asc("Marks"));*/
		//List<StudentInfo> res = c.list();
		//c.add(Restrictions.eq("Marks", 84));
		//c.add(Restrictions.gt("stdId", 3));
		//c.add(Restrictions.between("Marks", 80, 90));
	     c.add(Restrictions.like("StdName", "S%"));
		//c.add(Restrictions.or(Restrictions.between("stdId", 3, 5), Restrictions.between("stdId", 2, 4)));
		
		
		List<StudentInfo> users = (List<StudentInfo>)c.list();
		sess.getTransaction().commit();
		sess.close();
		for(StudentInfo u:users) {
		     System.out.println(u.getMarks());
		     System.out.println(u.getStdId());
			 System.out.println(u.getStdName());
	}
}

}
