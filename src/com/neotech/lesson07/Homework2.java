package com.neotech.lesson07;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number from 1 to 7: ");
		int day = scan.nextInt();

		// using &7 operator
		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday!");
		} else if (day >= 6 && day <= 7) {
			System.out.println("It is a weekend!");
		} else {
			System.out.println("Invalid day!");

		}
		// Using || operator (OR)
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It is a weekday!");
		} else if (day == 6 || day == 7) {
			System.out.println("t is a weekend!");
		} else {
			System.out.println("Invalid day!");

		}
		// Customise
		if (day >= 1 && day <= 5) {
			System.out.println("It is a weekday!");
		} else if (day == 6 || day == 7) {
			System.out.println("t is a weekend!");
		} else {
			System.out.println("Invalid day!");

		}
	}
}
