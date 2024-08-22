package com.neotech.lesson02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// Data type name/identifier = value;
		// ist way of creating
		int number1 = 5; // declare and assign value

		// 2nd way
		// java allows us to declare a variable without assigning an initial value
		int number2; // decleration
		number2 = 10; // assigning a value

		/*
		 * char c1; char c2; char c3;
		 */
		char c1, c2, c3;

		c1 = '@';
		c2 = '#';
		c3 = '&';

		System.out.println(number2);
		System.out.println(c3);
		// value reassignment
		System.out.println(number1);// this will print the current value which is 5.

		number1 = 15; // this is the value reassigment
		// after thusstatement, Java knows that the new value is 15
		System.out.println(number1); // new value (15) will be printed

		//number1 = "55" this is not allowed since number1 is an integer and "55" is a string
		number1 = 55;
		System.out.println(number1);
		number1 = 40;// Java will not print this because 
		number1 = 100;//it is overwrittem by100.
		System.out.println(number1);
		
	}       

}
