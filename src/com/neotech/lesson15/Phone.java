package com.neotech.lesson15;

public class Phone {
	
	String color;
	String brand;
	String model;
	int price;
	
	void call() {
		System.out.println(brand + " can make calls");
	}
	void text() {
		System.out.println(brand + " can send text messages");
	}
	void navigate() {
		System.out.println(brand + " can use the GPS for navigation");
	}

}
