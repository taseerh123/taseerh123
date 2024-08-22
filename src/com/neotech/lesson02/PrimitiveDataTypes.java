package com.neotech.lesson02;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		byte age = 29;
		short distance = 1200;
		short seconds = 3;
		System.out.println(seconds);
		int number = 85000;
		int number2 = 5;
		//if you know the number will be more than 2 billion use long
		long longNumber1 = 436547862L;
		long longNumber2 = 6L;
		// to decide which primitives to use , check the ranges of the variables
		double doubleNumber = 25.65443226567;
		float floatNumber = 25.65748873F;
		System.out.println(floatNumber);
		System.out.println(doubleNumber);
		
		//character defination
		char firstCharacter = 'R'; // do not use double quotes for characters
				char dollar = '$'; // it should be single quotes(')
				char space = ' ';
		// boolean accepts true or false
				boolean isRaining = false;
				System.out.println(firstCharacter);
				System.out.println(dollar);
				System.out.println(space);
				System.out.println(isRaining);
	}

}
