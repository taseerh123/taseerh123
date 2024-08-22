package com.neotech.review12;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int[] numbers = new int[3];

		try {
			numbers[0] = 10;
			numbers[1] = 20;
			numbers[2] = 30;
			numbers[3] = 40;
			numbers[4] = 50;
		} catch (Exception e) {
			// System.out.println(e);
			// System.out.println(e.getMessage());
			// e.printStackTrace();

			// Printing a meaningful message
			System.out.println("You are storing an element outside of the array!");
		}

		System.out.println("Will this line be printed?");


	}

}
