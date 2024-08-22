package com.neotech.lesson21;

public class Constructors {
	
	//default object creation flow
			//--> when we say new Constructors() ---> calls the default constructor
		
		
		Constructors()
		{
			this(5);
			System.out.println("Default constructor");
		}
		
		
		
		
		//2nd constructor
		Constructors(int x)
		{
			this(5,10);	
			System.out.println("Hello from the 2nd constructor");
		}
		
		
		//3rd constructor
		Constructors(int x, int y)
		{
			System.out.println("Hello from the 3rd constructor");
		}
		

	public static void main(String[] args) {
		
Constructors cs1 = new Constructors();
		
		Constructors cs2 = new Constructors(5);
		
		

	}

}
