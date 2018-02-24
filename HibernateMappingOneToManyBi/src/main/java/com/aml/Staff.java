package com.aml;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="staff")
public class Staff {
	int staffId;
	String staffName;
	College college;
	@Id
	@GeneratedValue
	@Column(name="staff_id")
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	@Column(name="staff_name")
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	@ManyToOne(cascade=CascadeType.ALL)
	
	

	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Staff(String staffName, College college) {
		//this.staffId = staffId;
		this.staffName = staffName;
		this.college = college;
	}
	
	public Staff() {
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", c=" + college + "]";
	}

}
