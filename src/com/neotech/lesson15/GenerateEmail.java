package com.neotech.lesson15;

import java.util.Scanner;

public class GenerateEmail {
	  	 
	String createEmail(String firstName, String lastName, String emailType) {
		String email = firstName+lastName+ "@"+emailType+".com";
		return email;
	}
	
	
	
	
	public static void main(String[] args) {
		GenerateEmail emailGenerator = new GenerateEmail();
		
		String email = emailGenerator.createEmail("John", "Snow", "gmail");
		System.out.println(email);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String firstName = scan.next();
		
		System.out.println("Please enter your last name:");
		String lastName = scan.next();
		
		System.out.println("Please enter your email provider:");
		String emailProvider = scan.next();
		String yourEmail = emailGenerator.createEmail(firstName, lastName, emailProvider);
		System.out.println("your email is " + yourEmail);
	}

}
