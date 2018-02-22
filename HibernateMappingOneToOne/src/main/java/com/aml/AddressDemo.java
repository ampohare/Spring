package com.aml;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Addr")
public class AddressDemo {
	@Id
	@GeneratedValue
	@Column(name="add_pin")
	int pin;
	@Column(name="add_city")
	String city;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	StudentDemo sd;

	@Override
	public String toString() {
		return "AddressDemo [pin=" + pin + ", city=" + city + ", sd=" + sd + "]";
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

	public StudentDemo getSd() {
		return sd;
	}

	public void setSd(StudentDemo sd) {
		this.sd = sd;
	}

	public AddressDemo(String city, StudentDemo sd) {
		super();
		this.pin = pin;
		this.city = city;
		this.sd = sd;
	}

	public AddressDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
