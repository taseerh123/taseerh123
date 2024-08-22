package com.neotech.review05;

public class FamilyMember {
	String firstName;// instance variable belongs to object
	static String lastName; // class variable , belongs to class
	int age;//instance variable
	
	void printFullName() {
		System.out.println("Full name is: " + firstName + " " + lastName);
	}
	static void printFamilyName(){
		System.out.println("Full name is: " + lastName);
	}
}
