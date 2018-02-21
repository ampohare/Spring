package hibernetdemo.hiberdemo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test 
{
    public static void main( String[] args )
    {
    	
    	CollegeInfo s=new StudentInfo( 1, "Walchand",23,"student");
    	CollegeInfo l=new LecturerInfo(13,"kedarnath",234,"java_teacher");
    	
    	CollegeInfo c=new CollegeInfo(1,"engg");
        @SuppressWarnings("deprecation")
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s1=sf.openSession();
        Transaction tr=s1.beginTransaction();
        s1.save(c);
        s1.save(s);
        s1.save(l);
        tr.commit();
        s1.close();
        
        
        
    }
}
