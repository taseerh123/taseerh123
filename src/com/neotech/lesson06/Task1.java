package com.neotech.lesson06; 

import java.util.Scanner;// ctrl + shift + O

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
System.out.println("Please enter your first name");
String firstName = input.next();

System.out.println("Please enetr your last name");
String lastName = input.next();
 System.out.println(" Your full name " + firstName + " " + lastName);
 
 System.out.println("Enter your full name");
 String fName = input.next();
 String lName =  input.next();
 System.out.println(fName + " " + lName);
 
 
 System.out.println("Enter your first name, age, and gender:");
 String first = input.next();
 int age = input.nextInt();
 String gender = input.next();
 System.out.println("name: " + first + " age: " + age + " gender: " + gender );
	}

}
