package com.neotech.lesson19;

public class StaticKeyword {
	
	String color; //instance variable 
	int memory;
	
	static String brand;
	static boolean touchscreen;
	
	void displaySpecificInfo()
	{
		System.out.println("We build a " + brand + " with " + memory + "GB memory and it is " +  color);
	}
//static methods can run directly using the className , they cannot reference the instance variable
	
	
	static void displaySpecificInfo_2()
	{
		System.out.println("Brand is " + brand + " and the touchscreen is " + touchscreen);
	}

	public static void main(String[] args) {
		
		displaySpecificInfo_2();
		

	}

}
