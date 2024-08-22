package com.neotech.lesson27;

public class Registration {
	
	/*
	 * Create Registration Class in which you would have variables as email,
	 * userName and password that have an access scope only within its own class.
	 * After creating an object of the class user should be able to call methods and
	 * in each method separately pass values to set users email, username and
	 * password.
	 * 
	 * Requirements: 
	 * Valid email consider to be only yahoo! 
	 * Valid userName and password cannot be empty and should be of length larger than 
	 * 6 characters.
	 * Also valid password cannot contain userName.
	 * 
	 */

	// private String email;
	// private String userName;
	// private String password;

	private String email, userName, password;

	// We can use Source to help in generating code .... but keep in mind it won't
	// customize it for you.

	// getter/accessor for email
	public String getEmail() {
		return email;
	}

	// setter/mutator for email
	public void setEmail(String email) {

		if (email.endsWith("yahoo.com")) {
			this.email = email;
		} else {
			System.out.println("Only yahoo emails are accepted!");
		}
	}
	
	
	
	
	//getter for username
	public String getUserName() {
		return userName;
	}
	
	

	
	//setter for username
	//1 it shouldn't be empty
	//2 it should have more than 6 characters
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length() >= 6)
			//we could use 
			//if (!userName.isBlank() && userName.length() >= 6)
		{
			this.userName = userName;
		}
		else
		{
			System.out.println("Username should be larger than 6 characters!");
		}
		
	}

	
	
	//getter for password
	//we could just not implement this method
	//usually, you only change your passwords, you don't get the old one back
	public String getPassword() {
		return password;
	}
	
	
	//setter for password
	public void setPassword(String password) {
		if (!password.isEmpty())
		{
		
			if (password.length() >= 6)
			{
				
				if(!password.contains(userName))
				{
					//what if we wanted to ignore case on this contains()??
					//if(!password.toLowerCase().contains(userName.toLowerCase()))
					this.password = password;
					
				}
				else
				{
					System.out.println("The password cannot contain the username!");
				}
			}
			
			else
			{
				System.out.println("The password must be longer than 6 characters!");
			}
			
			
		}
		else
		{
			System.out.println("The password cannot be empty!");
		}
		
		
	}


}
