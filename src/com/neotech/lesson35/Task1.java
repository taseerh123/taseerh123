package com.neotech.lesson35;


public class Task1 {

	public static void main(String[] args) {
		// Create a method to check age eligibility that will throw a runtime exception. 
		// Method should throw an exception if age is less than 16.

		try
		{
			canYouDrive(14);
		}
		catch(YouCannotDriveException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of code!");
	}

	
	public static void canYouDrive(int age)
	{
		if(age < 16)
		{
			throw new YouCannotDriveException("You CANNOT drive at " + age);
		}
		else
		{
			System.out.println("Drive safe!");
		}
		
	}
	
}


class YouCannotDriveException extends RuntimeException
{
	public YouCannotDriveException(String msg)
	{
		super(msg);
	}
	}

