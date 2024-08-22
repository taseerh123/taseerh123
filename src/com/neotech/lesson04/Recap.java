package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {
		//order of arithmetic operations
		//PEMDAS
		 int num1 = 5 + 5 + 5;
		 System.out.println(num1);
		 
		 int num2 = 5 + 5 * 5;
		 System.out.println(num2);
		 
		 int num3 = (5+5) * 5;
		 System.out.println(num3);
		 
		 //could also add directly on console
		 System.out.println(5*5 + 5/5);
		 
		 int number1 = 15;
		int number2 = 3;
		int div = number1/number2;
		
	System.out.println("div ->" + div);
	
	int rem = number1 % number2;
	System.out.println("rem -> " + rem);
	
	
	System.out.println("addition vs Concatenation");
	
	int a = 10;
	int b = 10;
	
	String x = "Java";
	String y = "Wednesday";
	System.out.println(x + " " +y);
	System.out.println(x + y + a);
	System.out.println(x + a + b);
	
	System.out.println(x + (a + b));
	
	System.out.println("" + a + b);
	System.out.println(a + b);
	
	System.out.println(a + b + x + y); // int +int+ string + string
	
	System.out.println(x + y + a * b);
	System.out.println(x + y + a + b);	
	
	//string +int ---. string
	// int + string ---> string
	// int + int ---. int
	//string * int ---. not allowed 
	// int + int + int + string ----> string
	
	}

}
