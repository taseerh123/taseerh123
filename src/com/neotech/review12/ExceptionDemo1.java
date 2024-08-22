package com.neotech.review12;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		division(12, 6);
		division(7, 0);
		division(20, 5);

	}

	public static void division(int num1, int num2) {

		try {
			int result = num1 / num2;
			System.out.println("result -> " + result);
		} catch (ArithmeticException ex) {

			// Write the problem/exception into a file
			System.out.println("Problem when dividing " + num1 + " by " + num2);

			System.out.println("Exception -> " + ex);
			System.out.println("Exception Message -> " + ex.getMessage());
			ex.printStackTrace();

		} finally {
			System.out.println("NeoTech is the best!!!");
		}

	}

}
