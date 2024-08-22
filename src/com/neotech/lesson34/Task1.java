package com.neotech.lesson34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		//How would you handle the InputMismatchException? 
		//InputMismatchException when user enters mismatch value then programmer expected.

		
		//create a scanner object
		Scanner scan = new Scanner(System.in);
		//scan name and age from the user.
		String name;
		int age;
		
//		System.out.println("Enter your name: ");
//		name = scan.next();
		
//		System.out.println("Enter your age: ");
//		age = scan.nextInt();
		
//		System.out.println("Name: " + name + " Age: " + age);
		
		//Test 1: enter string and number  --> no issue
		
		//Test 2: enter String and string --> identify the Exception
				//The exception:InputMismatchException
		
		//handle the exception
		//try Test 2 again
		
		
		//code with the handled exception:
		try 
		{
			System.out.println("Enter your name: ");
			name = scan.next();
			
			System.out.println("Enter your age: ");
			age = scan.nextInt();
			
			System.out.println("Name: " + name + " Age: " + age);
		
		}
		catch (InputMismatchException ime)
		{
			System.out.println(ime.getMessage());
			ime.printStackTrace();
			System.out.println("Make sure you input the correct data!!!");
		}
		//you could add another catch as well 
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
