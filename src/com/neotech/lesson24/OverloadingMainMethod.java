package com.neotech.lesson24;

public class OverloadingMainMethod {

	public static void main(String[] args) {
System.out.println("I am the main main main method!!!");
		
		//args is just a variable name
		
		
		
		//which method will run
		//1. by default: public static void main (String[] args) --- starting point
		//2. any method I call here
		
		System.out.println("Call this main method: main(String, String) ");
		main("Hello", "Bye"); //calling this main: main(string, string) signature
		
		int[] myArray = {5, 6, 9, 15};
		main(myArray);
		
		
		//this is another type of polymorphism
		// static binding or compile time
		
		
	}
	
	//Lets overload the main method!!!
	
	public static void main(String str1, String str2)
	{
		System.out.println("Main method with two String parameters: " + str1 + " and " + str2);
	}
	
	//Am I overloading the main method?? YES
	public static void main(int[] array)
	{
		System.out.println("I am the main method with an int array parameter!");
	}
	
	//I can only have one method with a signature!!!
//	public static void main(String[] data)
//	{	
//	}



	}


