package com.neotech.review03;

public class CountingBackward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 1; row <= 4; row++) {
			
			for (int col = 4; col>= 1; col--) {
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for (int row = 4; row >=1; row--) {
			
			for (int col = 1; col <= 4; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for (int row = 1; row <=4; row++) {
			
			for (int col = 1; col <= 4; col++) {
				System.out.print(5 - row);
			}
			System.out.println();
		}
	}

}
