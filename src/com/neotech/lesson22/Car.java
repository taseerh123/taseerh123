package com.neotech.lesson22;

public class Car {
//  Write a Java program called Car. 
//	  Specify features and behaviors of the Car class.
//  Create SportsCar and FamilyCar subclasses of the Car class with their own features and behaviors.
//  Next, create a LuxurySportsCar that will inherit the SportsCar and also will have its own features 
//	  and behaviors.
//  Create objects from each class and test them.
	
	String make, model;
	int year;
	
	Car()
	{
		System.out.println("I am the Car default constructor!");
	}
	
	Car(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	

	
}

//this
//super

//this()
//super()


class SportsCar extends Car
{
	String transmission;
	int speed;
	
	SportsCar()
	{
	//	System.out.println("I am the SportsCar default constructor!");
		this("MB", "SL", 2000, "Automatic", 250);
	}

	//how do I initialize parameters???
		//we can control/reroute the object initialization 
	
	
	SportsCar(String make, String model, int year, String transmission, int speed)
	{
		//I am calling the constructor of the superclass with this signature (String, String, year)
		//if I used super() --> I'd calling the default constructor of the parent class
		super(make, model, year);
		//the rest of the variables belong on this class 
		this.transmission = transmission;
		this.speed = speed;
	}
	
}



class FamilyCar extends Car
{
	boolean childLock;
	int seats;
	
	FamilyCar()
	{
		//if I call a parametrized constructor here, then I would be assigning default values
		System.out.println("I am a constructor of the FamilyCar class!");
	}

	public FamilyCar(String make, String model, int year, boolean childLock, int seats) {
		super(make, model, year);
		this.childLock = childLock;
		this.seats = seats;
	}

}



class LuxurySportsCar extends SportsCar
{
	boolean designerSeats;
	
	//use default constructor

}
