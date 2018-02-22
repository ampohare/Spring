package com.aml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		StudentDemo sd1 = new StudentDemo("amit", null);

		AddressDemo ad1 = new AddressDemo("pune", null);
		ad1.setSd(sd1);
		sd1.setAd(ad1);

		StudentDemo sd2 = new StudentDemo("amol", null);
		AddressDemo ad2 = new AddressDemo("sangli", null);

		ad2.setSd(sd2);
		sd2.setAd(ad2);
		//System.out.println(sd1);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		//System.out.println(sd1);
		s.persist(sd1);
		
		 s.persist(sd2);
		tr.commit();
		s.close();
	}
}
