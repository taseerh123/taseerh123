package com.neotech.lesson15;

public class CalculatorWithReturn {
	
	int add(int a, int b) {
		return a + b;
		
	}
	int multiply (int a, int b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a/b;
	}
	int giveMeSomething() {
		return 10;
		
	}
	void dontGiveMeAnything() {
		System.out.println("nothing is sent back!");
	}
    double average(double a, double b, double c) {
    	return (a + b + c)/3.0;
    
    }
    String returnToString(int a) {
    	return ("your number is " + a);
    }
}
