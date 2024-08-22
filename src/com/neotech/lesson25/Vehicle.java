package com.neotech.lesson25;

public abstract class Vehicle {
	
	String color;

	public Vehicle(String color) {
		this.color = color;
	}

	public void drive() {
		System.out.println("Vehicle drives");
	}

	public void stop() {
		System.out.println("Vehicle stops!");
	}

	public abstract void start();

	public abstract void brake();
}

abstract class Car extends Vehicle {

	String carType;

	public Car(String color, String carType) {
		super(color);
		this.carType = carType;
	}

	@Override
	public void brake() {
		System.out.println(carType + " has brakes");
	}

	public abstract void carDetails();
}

class Tesla extends Car {

	public Tesla(String color, String carType) {
		super(color, carType);

	}

	@Override
	public void carDetails() {
		System.out.println("Details: " + carType + " " + color);

	}

	@Override
	public void start() {
		System.out.println(carType + " starts remotely");

	}

	public void display() {
		System.out.println("We have a " + color + " " + carType);
	}
}

class Toyota extends Car {

	public Toyota(String color, String carType) {
		super(color, carType);

	}

	@Override
	public void carDetails() {
		System.out.println("Details:" + carType + " " + color);

	}

	@Override
	public void start() {
		System.out.println(carType + " has keyless start!");

	}

}
