package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra {

	public static void main(String[] args) {
		
		
		String city;
		double f, c;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the city: ");
		city = input.nextLine();
		System.out.println("Now enter the temperature in Fhrenheit: ");
		f = input.nextDouble();
		
		c = (f - 32) * 5/9;
		System.out.println("The temperature in " + city + " is " + c + " celcius");

	}

}
