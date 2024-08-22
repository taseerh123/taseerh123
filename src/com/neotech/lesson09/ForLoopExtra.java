package com.neotech.lesson09;

public class ForLoopExtra {

	public static void main(String[] args) {
		System.out.println("print the number from 21 to 30");

		for (int i = 21; i <= 30; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nPrint the Even Numbers from 20 to 1");
		for (int i = 20; i >= 1; i = i - 2) {
			System.out.print(i + " ");
		}
		System.out.println("\nPrint the ODD numbers from 0 to 10");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i + " ");
		}

//2nd way
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\ncalculate the sum of odd numbers from 1 to 10");
		int sum = 0;
		for (int i = 1; i <= 10; i += 2) {
			sum += i;
		}
		System.out.println("sum is: " + sum);
// print numbers fron 1 to 100
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " ");
		}
//2nd way but in reverse
		for (int i = 100; i >= 1; i--) {
			System.out.println(i + " ");

		}
//Print numbers from 20 to 1
		for (int i = 20; i >= 1; i = i - 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 2nd way
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();// print odd numbers between 20 and 50 (2 ways)
		for (int i = 21; i <= 50; i = i + 2) {
			System.out.print(i + " ");
		}
//2nd way
		for(int i=20; i<=50;i++) {
			if(i % 2 ==1) {
				System.out.println(i + " ");
			}
		}
	}
}
