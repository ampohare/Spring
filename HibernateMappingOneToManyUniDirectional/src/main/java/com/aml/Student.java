package com.aml;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud")
public class Student {
	Long studId;
	String studName;
	public Student(String studName) {
		//this.studId = studId;
		this.studName = studName;
	}
	public Student() {
		super();
	}
	@Id
	@GeneratedValue
	@Column(name="stud_id")
	public Long getStudId() {
		return studId;
	}
	public void setStudId(Long studId) {
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
