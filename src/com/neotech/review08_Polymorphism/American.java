package com.neotech.review08_Polymorphism;

public class American extends Human {
	
	String SSN;

	public American(String name, String SSN) {
		super(name);
		this.SSN = SSN;
	}

	public void talk() {
		System.out.println("I speak English. My name is " + name);
	}

	public void taxReturn() {
		System.out.println("I am doing my taxes!");
	}


}
