package com.aml.HibernateMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentinfo")
public class Student {
	
	int studId;
	
	String studName;
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}
	public Student(String studName) {
		//this.studId = studId;
		this.studName = studName;
	}
	public Student() {
		super();
	}
	@Id
	@GeneratedValue
	@Column(name="studId")
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	@Column(name="stud_name")
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	

}
