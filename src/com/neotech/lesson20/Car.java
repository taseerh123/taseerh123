package com.neotech.lesson20;

public class Car {
	String make,model;
	int year;
	
	//default constructor
	Car(){
		System.out.println("I am a default constructor");
	}
	
	//constructor with parameter
	Car(String mk, String mdl, int yr){
		make = mk;
		model = mdl;
		year = yr;
		
	}
	
	void printDetails() {
		System.out.println("I have a " + make + " " + model + " " + year);
	}
}
