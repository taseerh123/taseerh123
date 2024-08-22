package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		String dbUser = "user";
		String dbPassword = "password";
		
		
		Scanner scan = new Scanner(System.in);
		//input from user
		String user;
		String password;
		
		//ask user for credentials
		//check if they are true
		 // if correct, then end the loop, done
		// if  incorrect, then go to step 1
		do {
			System.out.println("Enter your username and pasword:");
			user = scan.next();
			password= scan.next();
			if (user.equals(dbUser) && password.equals(dbPassword))
			{
			System.out.println("You are logged in!!!");	
			break;
			}
	}
while(true); //this means always stay true
}
}