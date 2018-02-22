package com.aml;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Stud")

public class StudentDemo {
	@Id
	@GeneratedValue
	@Column(name="Stud_id")
	int studId;
	@Column(name="stud_name")
	String studName;
	@OneToOne(mappedBy="sd",cascade=CascadeType.ALL)
	//@JoinColumn(name="primary key")
	AddressDemo ad;
	public StudentDemo(String studName, AddressDemo ad) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.ad = ad;
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
	public AddressDemo getAd() {
		return ad;
	}

	public void setAd(AddressDemo ad) {
		this.ad = ad;
	}
	public StudentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentDemo [studId=" + studId + ", studName=" + studName + ", ad=" + ad + "]";
	}
	
	
	
}
