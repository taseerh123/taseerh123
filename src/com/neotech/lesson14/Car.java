package com.neotech.lesson14;

public class Car {
	

	    // Features of a car
	    String make;
	    String model;
	    String color;
	    int year;
	    double mileage;

	    // Behaviors of a car
	    void drive() {
	        System.out.println(make + " " + model + " drives!");
	    }

	    void stop() {
	        System.out.println(make + " stops!");
	    }

	    void transportPeople() {
	        System.out.println(make + " can transport people!");
	    }

	    // The main method to test the Car class
	    public static void main(String[] args) {

	        // Creating an object of Car class
	        Car car1 = new Car();

	        // Setting attributes of the car1 object
	        car1.make = "BMW";
	        car1.model = "M5";
	        car1.color = "Red";
	        car1.mileage = 15000;
	        car1.year = 2021;

	        // Reassigning mileage
	        car1.mileage = 20000;

	        // Printing the details of the car1 object
	        System.out.println(car1.make + " " + car1.model + " " + car1.color + " " 
	            + car1.year + " " + car1.mileage);

	        // Accessing the methods of the car1 object
	        car1.drive();
	        car1.stop();
	        car1.transportPeople();
	    }
	


}
