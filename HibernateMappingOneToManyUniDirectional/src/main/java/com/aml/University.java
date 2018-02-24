package com.aml;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="university1")
public class University {
	Long univesityId;
	String universityName;
	Set<Student> Sd;
	public University(String universityName,  Set<Student> sd) {
		//this.univesityId = univesityId;
		this.universityName = universityName;
		Sd = sd;
	}
	public University() {
		super();
	}
	@Id
	@GeneratedValue
	@Column(name="uni_id")
	public Long getUnivesityId() {
		return univesityId;
	}
	public void setUnivesityId(Long univesityId) {
		this.univesityId = univesityId;
	}
	@Column(name="uni_name")
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	@OneToMany(cascade=CascadeType.ALL)
	@GeneratedValue
	@JoinTable(joinColumns= {@JoinColumn(name="uni_id")},inverseJoinColumns= {@JoinColumn(name="stud_id")})
	public Set<Student> getSd() {
		return Sd;
	}
	public void setSd(Set<Student> sd) {
		Sd = sd;
	}
	@Override
	public String toString() {
		return "University [univesityId=" + univesityId + ", universityName=" + universityName + ", Sd=" + Sd + "]";
	}
	

}
