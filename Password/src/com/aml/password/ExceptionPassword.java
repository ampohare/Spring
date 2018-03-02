package com.aml.password;

public class ExceptionPassword extends Exception{
	ExceptionPassword(String s){
		super(s);
		System.out.println("input should be low, high, midium");
	}
}
