package com.aml;

import java.applet.AppletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	/*Resource res = new FileSystemResource("H:\\Scopen_Java_Class\\SpringDemo\\src\\main\\java\\springDemoContext.xml");
    	BeanFactory factory = new XmlBeanFactory(res);*/
       /* Student s1=(Student)factory.getBean("Student");
        System.out.println(s1);*/
   
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("springDemoContext.xml");
        //Student s1=(Student)context.getBean("Student");
    
    	    
    
    }

	private static void test() {
		// TODO Auto-generated method stub
		
	}
}

/**
 * @author Dell02
 *
 */
class Student{
	
	int studId;
	String studName;
	Address ad;
	
	
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", ad=" + ad + "]";
	}
	public Student() {
		super();
		System.out.println("inside in default costructor");
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
	
	
	
	
}


class Address{
	int pinCode;
	String City;
	
	
	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", City=" + City + "]";
	}
	public Address() {
		System.out.println("inside the Address default cnstructor");
		
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
	
}