package com.neotech.lesson04;

public class Task1 {

	public static void main(String[] args) {
		int number1 = 500;// can fit +-2 billion
		// byte -128 to 127
		 
		byte number2 =  (byte) number1;
		System.out.println(number2);
		
		number1 = 50; //reassigning
		number2 = (byte) number1; //reassigning the value of number2 --> casting again
		System.out.println(number2);

	}

}
