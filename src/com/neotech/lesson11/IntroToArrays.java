package com.neotech.lesson11;

public class IntroToArrays {

	public static void main(String[] args) {
		int[] array2;
		array2 = new int[3];// 3 elemnts with index 0, 1, 2
		array2[2] = 10;//index 2 element 3 assign value
		//array2[3] = 15;//Exception: ArrayIndexOutOfBounds
		String[] strArray = new String[2];
		//assigning a value
		strArray[1] = "New York";
		strArray[0] = "London";
		System.out.println(strArray[1]);
		char[] letters = new char [6];
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';
		letters[4] = 'E';
		letters[5] = 'F';
		System.out.println("The letters at index 5 is: " + letters[5]);
		
				

	}

}
