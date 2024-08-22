package com.neotech.lesson08;

import java.util.Scanner;

public class IntroToWhileLoop {

	public static void main(String[] args) {

		int num = 1;
		// to avoid a loop to run forever (infinite loop) we need a control variable

		while (num < 11) {
			System.out.print(num);
			num++;// this makes sure that num keeps incresing and that the loop ends sometime
			
		}
		System.out.println();
		num = 1;
		while (num < 11) {
			System.out.println(num++ + " ");
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		int var = 5;
		//idea 1: start with 1, while car <=5 perfrom the action
		// idea 2: start with 5, while var>5 perfrom the action --
		while (var > 0)
		{
			System.out.println("Enter a number: ");
			int n = scan.nextInt();
			System.out.println("The number is: " + n);
			var--;
		}
	}

}
