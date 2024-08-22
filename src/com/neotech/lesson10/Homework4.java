package com.neotech.lesson10;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String answer;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Do you want to apply for a credit card?");
			answer = scan.next();
			
			if(answer.equalsIgnoreCase("yes"))
			{
				System.out.println("Perfect, lets do it!");
				break;
			}
		}

	}

}
