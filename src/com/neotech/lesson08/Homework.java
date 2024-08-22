package com.neotech.lesson08;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your grade: ");
		char grade = scan.next().charAt(0);

		switch (grade) {
		case 'A':
			System.out.println("A-Excellent!");
			break;
		case 'B':
			System.out.println("B-Good");
			break;
		case 'C':
			System.out.println("C-Average");
			break;
		case 'D':
			System.out.println("D-Bad");
			break;
		default:
			System.out.println("Not Acceptable");
			break;
		}
 if (grade == 'A' || grade == 'a')
 {
	 System.out.println("A-Excellent!");
 }
 else if (grade == 'B')
 {
	 System.out.println("B-Good");
 }
 else if (grade == 'C')
 {
	 System.out.println("C-Average");
 }
 else if (grade == 'D')
 {
	 System.out.println("D-Bad");
 }
 else
 {
	 System.out.println("Not Acceptable!");
 }
	}

}
