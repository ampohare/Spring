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
       Set<Staff> st=new HashSet<Staff>();

       Staff s=new Staff("amol", null);
       Staff s1=new Staff("amol", null);
       st.add(s1);
       st.add(s);
       College c=new College("iicmr", st);
       s.setCollege(c);
       s1.setCollege(c);
       SessionFactory sf=new Configuration().configure().buildSessionFactory();
       Session session=sf.openSession();
       Transaction tr=session.beginTransaction();
       session.persist(c);
       tr.commit();
       session.close();
    }
}
