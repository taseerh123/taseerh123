package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {
		int[] grades = new int[5];
		System.out.println("The size of this array is:" + grades.length);
		
		System.out.println("Grade with index 2 is: " + grades[2]);
		System.out.println("Second grade in my array is: " +  grades[1]);
		
		
		grades[3] = 90;
		grades[4] = 95;
		grades[1] = 80;
		grades[0] = 85;
		// total
		int sum = 0;
		for (int i=0; i<grades.length; i++) {
			sum += grades[i];
			
		}
		System.out.println("Sum of all grades is:" + sum);
		System.out.println("Avg of all grades is: " + sum / grades.length);
		
		String[] cities = {"Bostonn", "Istanbul", "Madrid", "Beirut", "Chicago", "Paris"};
		System.out.println("The length of the array is;" + cities.length);
		
		//how can i print the last city
		int lastIndex = cities.length - 1;
		System.out.println("The last city is: " + cities[lastIndex]);
		
		//how can i print the city names on the screen
		for(int i = 0; i < cities.length; i++ ) {
			System.out.print(cities[i] + ",");
		}
		System.out.println();
		
		for(int i = lastIndex; i >=0; i--) {
			System.out.print(cities[i] + ",");
		}

	}

}
