package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		//how to import the Scanner library
		// import it using the Java suggestion box
		//or CTRL + Shift + o
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name:");
		String name = input.next();
		System.out.println("Your name is " + name);
		
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("You are " + age + " years old");
		
		System.out.println("Is it raining outside?");
		boolean isRaining = input.nextBoolean();
		if (isRaining) {
			System.out.println("It is raining outside.Dont forget your umbrella!");
		}else {
			System.out.println("It is not raining");
		}
		
		
		
		
	

	}

}
 