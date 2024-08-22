package com.neotech.lesson06;

public class Homework3 {

	public static void main(String[] args) {
		int number = 35757;
		
		//modulus % --> showz us the remainder after division
		if (number %2 == 0) {
			System.out.println("This number is EVEN!");
		} else {
			System.out.println("This number is ODD!");
		}
// 2nd way
		if (number %2 ==1) {
			System.out.println("This number is ODD!");
		} else {
			System.out.println("This number is EVEN!");
		}
		//3rd way
		int remainder = number % 2;
		if (remainder == 0) {
			System.out.println("This number is EVEN!");
		}else {
			System.out.println("This number is ODD!");
		}
	}

}
