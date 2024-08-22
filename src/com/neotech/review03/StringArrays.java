package com.neotech.review03;

public class StringArrays {

	public static void main(String[] args) {
		String [] animals = {"dog", "cat", "fish", "horse", "goat" };
		
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] +  " ");
		}
		System.out.println();
		for (String element : animals) {
			System.out.print(element + " ");
		}
		System.out.println();
		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		
	}

}
