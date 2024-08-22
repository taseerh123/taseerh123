package com.neotech.lesson11;

public class Task1 {

	public static void main(String[] args) {
		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		System.out.println(grades[1]);
		//2nd way
		
		char[] grades2 = { 'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades2[1]);

	}

}
