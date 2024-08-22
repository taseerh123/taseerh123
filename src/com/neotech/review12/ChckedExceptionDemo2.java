package com.neotech.review12;

public class ChckedExceptionDemo2 {

	public static void main(String[] args) {

		System.out.println("Hi Java!");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Something went wrong while sleeping!");
		}

		System.out.println("Bye Java!");
	}

}
