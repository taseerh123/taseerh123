package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {
		String firstName = "Minnu";
		System.out.println("My name is " + firstName);
		//declare a variable and assign a value
		String lastName = "Lochni";
		
		int age = 20;
		System.out.println(firstName + " " + lastName + " " + age + 1);
		//After 10 years
		//age = age + 10;
		//or
		age += 10;
		lastName = "Hussain";
		System.out.println("After getting married!");
		System.out.println(firstName + " " + lastName + " " + age);
	}

}
 