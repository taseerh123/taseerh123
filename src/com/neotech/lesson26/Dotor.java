package com.neotech.lesson26;

public class Dotor {
	
	private long licenseID;
	private long phoneNumber;
	private String email;
	
	
	//getter for licenseID
		//getter: 
			// - will have a return type same as the type of the variable we are returning
			// - no parameter needed
	
	public long getLicenseID()
	{
		return licenseID;
	}
	
	
	//getter for phoneNumber
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	
	//getter for email
	public String getEmail()
	{
		return email;
	}
	
	
	//setter for licenseID
		//typical setter: 
			// - void return type
			// - input parameter
			// - perform assignment 
	
	public void setLicenseID(long licenseID)
	{
		this.licenseID = licenseID;
	}
	
	
	
	//setter for phoneNumber
	public void setPhoneNumber(long phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	
	//setter for Email: I will assume that I have to consider these requirements: 
		//1. email cannot be empty
		//2. email must contain @gmail
	public void setEmail(String email)
	{
	
		if (!email.isEmpty())
		{
			if (email.contains("@gmail"))
			{
				this.email = email;
			}
			else //the email does not have @gmail on it
			{
				System.out.println("You have to use a gmail account!!!");
			}
			
		}
		else //email is empty
		{
			System.out.println("Email cannot be empty!!!");
		}
		
		
		//we could do this
		
	//	if (!email.isEmpty() && email.contains("@gmail"))
	//	{
	//		this.email = email;
	//	}
		
	}

}
