package com.aml;

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
    	Set<Student> set=new HashSet<Student>();
    	Student std=new Student("amol");
    	Student std2=new Student("abhijeet");
    	Student std3=new Student("anjali");
    	Student std4=new Student("atul");
    	Student std5=new Student("amar");
    	set.add(std);
    	set.add(std2);
    	set.add(std3);
    	set.add(std4);
    	set.add(std5);
    	University u=new University("Pune", set);
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tr=s.beginTransaction();
    	s.persist(u);
    	tr.commit();
    	s.close();
    	
        
    }
}
