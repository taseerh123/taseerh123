package com.neotech.lesson10;

public class EasyPatterns {

	public static void main(String[] args) {
		// *****
		/// ***
		//// *
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		//this is not practical
		
		
		
		for (int row = 5; row > 0; row --)
		{
			for(int col = 0; col < row; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
