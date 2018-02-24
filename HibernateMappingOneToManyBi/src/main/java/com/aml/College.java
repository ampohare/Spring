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
@Table(name="colle")
public class College {
	int collegeId;
	String collegeNmae;
    Set<Staff> sf;
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeNmae=" + collegeNmae + ", sf=" + sf + "]";
	}
	public College(String collegeNmae, Set<Staff> sf) {
		this.collegeNmae = collegeNmae;
		this.sf = sf;
	}
	public College() {
		super();
		
	}
	@Id
	@GeneratedValue
	@Column(name="coll_id")
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	@Column(name="coll_name")
	public String getCollegeNmae() {
		return collegeNmae;
	}
	public void setCollegeNmae(String collegeNmae) {
		this.collegeNmae = collegeNmae;
	}
	@OneToMany(cascade=CascadeType.ALL,mappedBy="college")
	
	
	
	public Set<Staff> getSf() {
		return sf;
	}
	public void setSf(Set<Staff> sf) {
		this.sf = sf;
	}

}
