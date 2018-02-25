package com.aml;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Student s1 = new Student(101, "Abc");
		Student s2 = new Student(102, "xyz");
		Student s3 = new Student(103, "SSSSS");
		Student s4 = new Student(104, "ABCASAQA");
		Student s5 = new Student(105, "ANASQOAK");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// SessionFactory sFactory = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(s1);
		/*session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);*/
		session.flush();
		tr.commit();

		Query sqlQueryGetStockById = session.getNamedQuery("sqlfindStockWithGivenId");
		sqlQueryGetStockById.setInteger("sid",101);
		List<Student> listOfObjectsSQLID = sqlQueryGetStockById.list();
		System.out.println("\nSQL By ID -- " + listOfObjectsSQLID);
		
		
		/*Query hqlQueryGetStockById=session.getNamedQuery("@HQL");
		hqlQueryGetStockById.setInteger("sid",105);
		List<Student> listOfObjectsSQLID2 = hqlQueryGetStockById.list();
		System.out.println("\nHQL By ID -- " + listOfObjectsSQLID2);*/
		
	}
}

@Entity

@Table(name = "stud123")

@NamedNativeQueries({
		@NamedNativeQuery(name = "sqlfindStockWithGivenId", query = "select * from stud123  where stud_id = :sid", resultClass = Student.class),
		@NamedNativeQuery(name = "sqlfindStockWithGivenName", query = "select * from stud123  where stud_name = :sname", resultClass = Student.class) })

@NamedQueries({ @NamedQuery(name = "@HQL", query = "from Student s where s.studId = :sid") })

class Student {

	@Id
	@GeneratedValue
	@Column(name = "stud_id")
	int studId;
	@Column(name = "stud_name")
	String studName;

	public Student(int studId, String studName) {
		this.studId = studId;
		this.studName = studName;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public Student() {
		super();
	}

}