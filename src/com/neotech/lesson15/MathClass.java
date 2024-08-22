package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.println("Lets test addition");
		cal.add(6, 2);
		cal.add(143, 587);
		
		System.out.println("Lets test multiplication");
		cal.multiply(32, 57);
		
		System.out.println("Lets tst division");
		cal.divide(15, 4);
	}

}
