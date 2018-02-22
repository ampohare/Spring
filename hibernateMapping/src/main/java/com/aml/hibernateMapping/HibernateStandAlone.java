package com.aml.hibernateMapping;


	 
	import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
	
	 
	public class HibernateStandAlone {
	     
	    @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
	 
	        Student student = new Student("Sam","Disilva","Maths");
	        Address address = new Address("10 Silver street","NYC","USA");
	         
	         SessionFactory sf=new Configuration().configure().buildSessionFactory();
	        Session session = sf.openSession();
	        session.beginTransaction();
	 
	        session.persist(address);
	        student.setAddress(address);
	        session.persist(student);
	 
	         
	        session.getTransaction().commit();
	        session.close();  
	    }
	 
	}


