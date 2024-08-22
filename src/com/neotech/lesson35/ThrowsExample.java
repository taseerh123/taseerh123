package com.neotech.lesson35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) {
		
		calculator();
		
		try {
			read(" ");
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File not found!!! Check your path!");
		}
		
		System.out.println("Other stuff to do after I read the file....");
	}
	
	
	public static void calculator()// throws ArithmeticException //if I handle it, I don't have to add this
	{
		
		//when using methods/actions that can throw exceptions I have two options:
			//1. handle it myself
			//2. pass it along  --- throws ArithmeticException
		
		
	try {	
		division(10,2);
		division(9,3);
		division(7,0);
		division(4,4);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("The AE is handled!");
	}
		
	}
	
	public static void division(int a, int b) throws ArithmeticException
	{
		System.out.println(a/b);
	}
	
	//seeing the same thing for another type of Exception (checked)
	
	public static void read(String filePath) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(filePath);

	}

}
