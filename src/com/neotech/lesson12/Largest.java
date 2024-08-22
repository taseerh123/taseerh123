package com.neotech.lesson12;

public class Largest {

	public static void main(String[] args) {
		int[]numbers = { 5, 15, 20, 30, 50, 10, 75, 40, 11 };
		//indexed for loop
		int largest = numbers[0];
		//in order to find the largest in array, need to go through all the elements in array
		for(int i =0; i<numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println("The largest number is: " + largest);
		
		//enhanced for loop
		
		for(int number: numbers) {
			if(number > largest) {
				largest = number;
			}
		}
		System.out.println("The largest number is: " + largest);
	}

}
