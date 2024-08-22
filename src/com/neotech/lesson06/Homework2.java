package com.neotech.lesson06;

public class Homework2 {

	public static void main(String[] args) {
		int hour = 20;
		// option1 if hour is less than 12 -. Good Morning
		// if hour is greater than 12 and les than 15 --. good afternoon
		// if hour is greater than 15 or equal -> good evening
		if (hour < 12) {
			System.out.println("Good morning");
		}
		else if (hour < 15) {
			System.out.println("Good afternoon!");
		} 
		else {
			System.out.println("Good evening!");
		}

	}

}
