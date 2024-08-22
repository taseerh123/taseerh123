package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//type casting
		//byte  --. short --> int --> long --> float --> double  (we had two more char and boolean)
		
		
		double d1 = 3.7; // no casting happening here
		//3.7 is a double and is assigned to a double variable
		System.out.println(d1);
		
		double d2 = 5;// casting happened --> widening, implicit casting--> done automatically
		System.out.println(d2);
 
		//int num = 5.5; // compiler error: cannot convert from double to int
		//narrowing,manual casting, explicit casting
		
		int num2 = (int) 6.5;// if i do this . I am telling Java, i am sure, i want it to be stored in an int
		System.out.println(num2);
		
		
		byte b1 = (byte) 4578;
		System.out.println(b1);
		
		//int has 32 bits: 1010101010101010001001
		//byte has 8 bits:                00000001
		int num3 = 50;
		byte b2 = (byte) num3;
		System.out.println(b2 );
		// another narrowing example
		
		long L1 = 17L;
		int number = (int) L1; // am i loosing data here
		System.out.println(number);
		
		
		long L2 = 564783942323567893L;
		int number2 = (int) L2;
		System.out.println(number2);
		
		//another widening example
		int number3 = 250;
		float f1 =  (float) number3; // I can add it, but it is not necessary
		float f2 = number3;
		
		System.out.println(f1);
		System.out.println(f2);
	}

}
