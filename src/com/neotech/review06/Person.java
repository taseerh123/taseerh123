package com.neotech.review06;

public class Person {
	
	//instance vaiables
	public String name;
	int age;
	protected int weight;
	
	public Person() {
		
	}
	
	
	public Person(String pName, int PAge) {
		name = pName;
		age = PAge;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+name+ " age:" + age + " weight:" + weight);
	}
}
