package com.neotech.lesson03;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int num1, num2; // declaring 2 variables

//	initialization
		num1 = 23;
		num2 = 5;
		// declaring the variable and assigning the sum of two numbers
		// first doing calculation, then assigning
		int sum = num1 + num2; // addition
		int sub = num1 - num2; // subtraction
		int mult = num1 * num2; // multiplication
		int div = num1 / num2; // division
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		double d1,  d2;
		d1 = 23;
		d2 = 5;
		double doubleResult = d1 / d2;
		System.out.println(doubleResult);
		double intResult = num1 / num2;// dividing two ints, the result is 4
		System.out.println(intResult);// assigning 4 to a double variable
		
	}

}
