package com.neotech.review09;

public class WrapperDemo {

	public static void main(String[] args) {
		int num1 = 12;

//		Integer integer1 = new Integer(20); // until Java 1.8
//		Integer integer2 = Integer.valueOf(30); // Java 9 and up

		Integer integer1 = new Integer(num1); // Boxing/Wrapping
		int num2 = integer1.intValue(); // UnBoxing/UnWrapping

		// Easy way
		int num3 = 7;
		Integer integer3 = num3; // Auto-Boxing/Auto-Wrapping/Auto-Converting
		int num4 = integer3; // Auto-UnBoxing/Auto-UnWrapping/Auto-Converting

		// Double Wrapper
		double d1 = 6.5;
		Double d2 = d1; // Auto-Boxing

		// Long way
		Double d3 = new Double(9.2); // Boxing
		// Short way
		Double d4 = 9.2; // Auto-Boxing

		double d5 = d4; // Auto-UnBoxing

		boolean b1 = false; // primitive
		Boolean b2 = true; // Class

		Character c = '$'; // Auto-Boxing

		// int -> Integer
		// byte -> Byte
		// short -> Short
		// long -> Long
		// float -> Float
		// double -> Double
		// boolean -> Boolean
		// char -> Character
	}

}
