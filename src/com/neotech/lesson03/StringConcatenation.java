package com.neotech.lesson03;

public class StringConcatenation {

	public static void main(String[] args) {
		System.out.println("Hello" + "-" + "World");
		String language = "Java";
		System.out.println("I love Java");
		System.out.println("I love " + language);
		String s1 = "I love";
		String s2 = "Programming";

		System.out.println(s1 + " " + language + " " + s2);
		// Spacing in String
		// Formatting your keyboard
		// Windows --> CTRL + shift + f
		System.out.println("Tima");
		// String + number
		System.out.println("I am scared of " + 13);
		String s3 = "I am " + 2;
		System.out.println(s3);
		
		String s4 = s3 + 5;
	    System.out.println(s4);
//Order of operations in a String
	    System.out.println("I have " + 2 + 2 + " cats!");
	    
	    System.out.println("I have " + (2 + 2) + " cats!"); // 2 + 2 = 4cats
	}

}
