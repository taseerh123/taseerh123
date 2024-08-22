package com.neotech.lesson15;

public class Calculator {
 
	void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	void multiply(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}
	void divide(double a, double b) {
		double result = a/b;
		System.out.println("The division of " + a +" by " + b + " is " + result);
	}
}
