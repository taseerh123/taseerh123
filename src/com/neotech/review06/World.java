package com.neotech.review06;

public class World {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.displayInfo();
		
		p1.name = "Uygar";
		p1.age = 30;
		p1.weight = 170;
		p1.displayInfo();
		
		
		
		System.out.println("-------------------");
		//using the constructor with TWO parameter
		Person p2 = new Person("Sara", 30);
		p2.displayInfo();
	}

}
