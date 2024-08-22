package com.neotech.lesson09;

public class ForLoopIntro {

	public static void main(String[] args) {
		// printing numbers from 1 to 10

		int num = 1;
		while (num < 10) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

	}

}
