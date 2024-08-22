package com.neotech.lesson06;

public class LogicalAND {

	public static void main(String[] args) {
		// declare an integer
		// if the number is between 1 and 10 -> small number
		// if the number is between 11 and 100 -> medium number
		// if the number is between 101 and 1000 -> big number
		// if the number is greater than 1000 -> out of range
		int number = 40;
		// if the number is between 1 and 10 -> small number
		if (number >= 1 && number <= 10) {
			System.out.println("This is a small number");
		} else if (number >= 11 && number < 100) {
			System.out.println("This is a medium number");
		} else if (number >= 101 && number <= 1000) {
			System.out.println("This is a big number");
		} else {
			System.out.println("Out of range!");
		}

//lets use a string in our condition

		String name = "John";
		int age = 26;
		boolean isMale = true;
		if (name == "John" && age == 26 && isMale) {
			System.out.println("I found you!");
		} else {
			System.out.println(("Wrong person!"));
		}
	}

}
