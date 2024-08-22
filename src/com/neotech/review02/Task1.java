package com.neotech.review02;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int total = 0;
//
//		System.out.println("Please eneter a Positive number! To STOP enter -1");
//		num = scan.nextInt();
//		while (num != -1) {
//			total += num;
//
//			System.out.println("Please eneter a Positive number! To STOP enter -1");
//			num = scan.nextInt();
//
//		}
//		System.out.println("Total=" + total);
//		System.out.println("------------");
//
//		do {
//			System.out.println("Please eneter a Positive number! To STOP enter -1");
//			num = scan.nextInt();
//			
//			if(num != -1) {
//				total += num;
//			}
//			total += num;
//		} while (num != -1);
//		System.out.println("Total=" + total);
		
		
		
		for(int i =1; i <=3; i++) {
			System.out.println(i);
		}
		System.out.println("Please eneter a Positive number! To STOP enter -1");
		num = scan.nextInt();
		for (; num != -1;) {
			total += num;
			
			System.out.println("Please eneter a Positive number! To STOP enter -1");
			num = scan.nextInt();
		} 
		System.out.println("Total=" + total);
	}

}
