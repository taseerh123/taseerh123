package com.neotech.lesson27;

public class WrapperClasses {
	
	public static void main(String[] args) {

		int num = 10;
		
		Integer number1 = new Integer(20); //boxing an int into an Integer object
		
		int num2 = number1.intValue(); //unboxing -- getting the value from the Integer object
										//into an int
		
		
		Integer number2 = 30; //auto boxing
		int num3 = number2; //auto unboxing

		
		//what the max value that can be assigned to an int?
		System.out.println(number2.MAX_VALUE);
		//since they are static
		System.out.println(Integer.MIN_VALUE);
		
		
		
		Byte b1 = 25; //auto boxing
		System.out.println(b1);
		
		
		
		Double d1 = 5.5;
		double d2 = d1;
		
		
		Character c1 = '%';
		char c2 = c1;
		
		
		
		Boolean boolean1 = true;
		boolean boolean2 = boolean1;
		
		
		
	}

}
