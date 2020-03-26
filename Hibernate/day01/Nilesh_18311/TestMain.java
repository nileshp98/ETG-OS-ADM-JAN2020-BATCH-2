package com.sonata.Pizza;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestMain {
	public static void main(String[] args) {
		PizzaLogin pl1= new PizzaLogin();
		pl1.setUserName("Nilesh");
		pl1.setUserMobile("9606744696");
		
		PizzaOrder po1= new PizzaOrder();
		po1.setPizzalogin(pl1);
		
		po1.setCost(399.0);
		po1.setItem("Onion");
			
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(pl1);
		s1.save(po1);
		s1.getTransaction().commit();
		
		s1.close();
		
	}

}
