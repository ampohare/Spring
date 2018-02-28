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
    	Student s1=new Student("amol");
    	Student s2=new Student("abhijeet");
    	Student s3=new Student("anjali");
    	Student s4=new Student("atul");
    	Student s5=new Student("amar");
    	set.add(s1);
    	set.add(s2);
    	set.add(s3);
    	set.add(s4);
    	set.add(s5);
    	University u=new University("Pune", set);
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction tr=s.beginTransaction();
    	
    	s.persist(u);
    	set.remove(s1);
    	set.remove(s3);
    	set.remove(s4);
    	
    	tr.commit();
    	s.close();
    	
    	
        
    }
}
