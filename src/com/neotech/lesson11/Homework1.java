package com.neotech.lesson11;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		for (int i= 0; i < num; i++)
		{
			//this loop prints spaces
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			//this loop prints *
			for (int k = 0; k < 2*(num-i)-1; k++)
			{
				System.out.print("*");
			}
			
			
			
			
			System.out.println();
		}

	}

}
