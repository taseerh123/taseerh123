package com.neotech.lesson11;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) 
		{//this loop should run only once in a fist row
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			
			
			
			
			System.out.println();
		}

		
		
		for (int i = num-1; i >= 1; i--) 
		{//this loop should run only once in a fist row
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			
			
			
			
			System.out.println();
		}
	}

}
