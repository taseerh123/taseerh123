package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		int myLuckyNumber = 5;
		int usersGuess;
		
		Scanner scan = new Scanner(System.in);
		//using a while loop
		System.out.println("Guess my lucky number!");
		usersGuess = scan.nextInt();
		while(usersGuess != myLuckyNumber) {
			System.out.println("Nope! Try again!");
			usersGuess = scan.nextInt();
		}
System.out.println("You got it, you are the winner!");

//do-while loops
do {
	System.out.println("Guess my lucky number!");
	usersGuess = scan.nextInt();
	} while (usersGuess != myLuckyNumber);

System.out.println("You got it, you are the winner!");
	}

}
