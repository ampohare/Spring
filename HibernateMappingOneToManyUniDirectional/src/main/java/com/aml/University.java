package com.aml;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="university121")
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
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	@OneToMany(cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	
	/*@OneToMany
	 @Cascade({org.hibernate.annotations.CascadeType.DELETE_ORPHAN,
    org.hibernate.annotations.CascadeType.PERSIST})*/
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JoinTable(name="stun",joinColumns= {@JoinColumn(name="stud_id")},inverseJoinColumns= {@JoinColumn(name="uni_id")})
	
	//@JoinColumn
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
