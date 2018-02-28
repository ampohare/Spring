package com.aml;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.cfg.Configuration;

public class FetchingDemo {
	public static void main(String[] args) {
		Person p=new Person(1, "hrishikesh", null);
		Address add1=new Address(2134, "pune");
		Address add2=new Address(1234, "nanded");
		
		List<Address> l=new ArrayList<Address>();
		l.add(add1);
		l.add(add2);
		p.setAd(l);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		s.save(p);
		tr.commit();
		s.close();
		Session s2=sf.openSession();
		s2.get(Person.class, 1);
		
	}

}
/**
 * @author Dell02
 *
 */
@Entity(name="person")
@Table
class Person{
	@Id
	
	int perId;
	String perName;
	@OneToMany(cascade=CascadeType.ALL)
	//@Fetch(FetchMode.JOIN)
	@Fetch(FetchMode.SELECT)
	
	//@Fetch(FetchMode.SUBSELECT)
	@JoinColumn(name="ad1")
	
	List<Address> ad;
	public Person(int perId, String perName, List<Address> ad) {
		this.perId = perId;
		this.perName = perName;
		this.ad = ad;
	}
	
	public Person() {
	}

	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + ", ad=" + ad + "]";
	}
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public List<Address> getAd() {
		return ad;
	}
	public void setAd(List<Address> ad) {
		this.ad = ad;
	}
	
	
}

@Entity(name="ad123")
@Table
class Address{
	@Id
	int pin;
	String city;
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
	public Address() {
	}

	public Address(int pin, String city) {
		this.pin = pin;
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	
}