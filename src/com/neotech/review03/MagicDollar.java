package com.neotech.review03;

public class MagicDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// for(int i = 1; i<=4; i++) {
//	 System.out.println("$$$$$");
// }
//		for (int i = 1; i <= 4; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 || i == 4 || j == 1 || j == 5) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
				System.out.println("--------------");

				for (int k = 1; k <= 4; k++) {
					if (k == 2 || k == 3) {
						System.out.println("$   $");
					} else
						System.out.println("$$$$$");
				}
				System.out.println();
			}
		}

	}
}