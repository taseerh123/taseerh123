package com.neotech.lesson06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
	int num1, num2;
	
	Scanner myScanner;
	myScanner = new Scanner(System.in);
	System.out.println("Please enter the first number");
	num1 = myScanner.nextInt();
	
	System.out.println("Please enter the second number");
	num2 = myScanner.nextInt();
	System.out.println("Your number are " + num1 + " and " + num2);
	if(num1 > num2) {
		System.out.println(num1 + " greater than "+ num2);
	} else if(num2 > num1 ) {
		System.out.println(num2 + " is greater than " + num1);
	}else {
		System.out.println("Your numbers are the same!");
	}
	
myScanner.close();
	}

}
