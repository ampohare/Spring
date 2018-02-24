package com.aml.HibernateMapping;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="university")
public class University {
   
	Long universityId;
    
	String universityName;
   
   // @JoinTable(joinColumns)
   
	Set<Student>  sd=new HashSet<Student>();
	@Override
	public String toString() {
		return "University [universityId=" + universityId + ", universityName=" + universityName + ", sd=" + sd + "]";
	}
	 @Id
	   @GeneratedValue
	    @Column(name="university_id")
	public Long getUniversityId() {
		return universityId;
	}
	public void setUniversityId(Long universityId) {
		this.universityId = universityId;
	}
	@Column(name="university_name")
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	 @OneToMany(cascade=CascadeType.ALL)
	 @GeneratedValue
	 @JoinTable (name="mamam",joinColumns= {@JoinColumn(name="unibersity_id")},inverseJoinColumns= {@JoinColumn(name="studid")})
	public Set<Student> getSd() {
		return sd;
	}
	public void setSd(Set<Student> sd) {
		this.sd = sd;
	}
	public University(String universityName, Set<Student> sd) {
		super();
		//this.universityId = universityId;
		this.universityName = universityName;
		this.sd = sd;
	}
	public University() {
		super();
	}
	
}
