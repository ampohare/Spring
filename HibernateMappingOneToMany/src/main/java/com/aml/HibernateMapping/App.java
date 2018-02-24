package com.aml.HibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Set<Student> std=new HashSet<Student>();
    	std.add(new Student("amol"));
    	std.add(new Student("anjali"));
    	std.add(new Student("ahijeet"));
    	std.add(new Student("patil"));
    	std.add(new Student("swpnil"));
    	
    	University u=new University( "pune university", std);
    	
      SessionFactory sf=new Configuration().configure().buildSessionFactory();
      Session s=sf.openSession();
      Transaction tr=s.beginTransaction();
      s.save(u);
      tr.commit();
      s.close();
      
      
    }
}
