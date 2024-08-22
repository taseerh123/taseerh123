package com.neotech.lesson12;

import java.util.Arrays;

public class RetreiveElements {

	public static void main(String[] args) {
		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		// how do i get the values of the array?

		// ist way
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}
		System.out.println();
		System.out.println("-----------");
		
		
		// 2nd way: enhanced for loop
		
		for(char grade : grades) {
			System.out.print(grade + ", ");
		}
		
		System.out.println();
		String[] fruits = {"Apple", "Orange", "Cherry", "Banana", "Grape"};
		
		//ist way
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i].equals("Orange")) {
			System.out.println("Orange is my fav fruit");
		}else {
			System.out.println(fruits[i]);
		}	
		}
		//2nd way:enhanced for loop
		for(String fruit: fruits) {
			if(fruit.equals("Orange")) {
					System.out.println("Orange is my fav fruit");
		}else {
			System.out.println(fruit);
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(fruits));
	}

}
