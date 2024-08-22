package com.neotech.lesson23;

public class UserClass {
	

	/*
	  	Write program: UserClass that has a constructor that
	    initializes instance variable name and mobile number.
	    
	    Create a subclass UserInfo that will have user address
	    variable and it also being initialized through constructor
	    call. 
	    Print users name, mobile number and address in
	    userDetails method. Test your code.
		 
	 */
	
	String name;
	long mobileNumber;
	
	
	UserClass()
	{
		
	}
	
	//If I create a parametrized constructor and do not create a default constructor, that means that the user
	//can only create an object using the parametrized constructor
	UserClass(String name, long mobileNumber)
	{
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
}

class UserInfo extends UserClass
{
	String userAddress;
	
	
	UserInfo(String name, long mobileNumber, String userAddress)
	{
	//	super(); //if I do this, then I am calling the default constructor -- name = null, mobileNumber = 0;
		
		super(name, mobileNumber);
		this.userAddress = userAddress;
		
	}
	
	void userDetails()
	{
		System.out.println("User Details: \n");
		System.out.println("Name ---> " + name);
		System.out.println("Mobile ---> " + super.mobileNumber);
		System.out.println("Address ---> " + this.userAddress);
	}
	

}
