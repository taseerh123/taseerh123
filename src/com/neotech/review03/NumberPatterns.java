package com.neotech.review03;

public class NumberPatterns {

	public static void main(String[] args) {
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		System.out.println("------");
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

}
