package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BankTest {


	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.setAccountNum("07677521");
		b1.setAmount(6899.8);
		
		SavingAcc s1 = new SavingAcc();
		s1.setBankId(10);
		s1.setAccName("Savings Account");
		s1.setAccBalance(15000.90);
		s1.setAccountNum("09876526");
		
		CurrentAcc c1 = new CurrentAcc();
		c1.setBankId(20);
		c1.setAccName("Current Account");
		c1.setAccBalance(65965.90);
		c1.setAccountNum("05647526");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session sess = factory.openSession();
		sess.beginTransaction();
		sess.save(b1);
		sess.save(s1);
		sess.save(c1);
		sess.getTransaction().commit();
	}
}
