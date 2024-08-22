package com.neotech.lesson29;

public abstract class Insurance {
	/*
	Create a class Insurance that will have an attribute as insuranceName and 
	unimplemented behavior as getQuote() and cancelInsurance().
    
    Create 3 subclasses Car, Pet, Health.
    
    Car class has its own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/iterator access all methods of the class.
	 */
	
	String insuranceName;
	
	//can I use a constructor in an abstract class???
	
	Insurance(String insuranceName)
	{
		this.insuranceName = insuranceName;
	}
	
	public abstract void getQoute();
	public abstract void cancelInsurance();
	
}

class CarInsurance extends Insurance
{
	String carModel;

	CarInsurance(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQoute() {
		System.out.println("The qoute for the " + carModel + " is 1000$!");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Are you sure you want to cancel your car insurance?");
	}
	
}

class PetInsurance extends Insurance
{
	
	String petType;
	
	PetInsurance(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQoute() {
		System.out.println("The qoute for " + petType + " is 100$!");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Are you sure you want to cancel your pet insurance?");
	}
	
}

class HealthInsurance extends Insurance
{

	HealthInsurance(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQoute() {
		System.out.println("The qoute for health insurance is 2000$!");
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Are you sure you want to cancel your health insurance?");
	}
	
}
