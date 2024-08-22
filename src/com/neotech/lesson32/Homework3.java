package com.neotech.lesson32;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {

	public static void main(String[] args) {
		// Create a collection of integers in which you can keep duplicates.
		// Write a logic to find sum of all integers

		List<Integer> numbers = new ArrayList<>();

		numbers.add(55);
		numbers.add(25);
		numbers.add(3);
		numbers.add(62);
		numbers.add(33);
		numbers.add(25);

		// how to get the sum??

		int sum = 0;

		for (int i : numbers) {
			sum += i; // sum = sum + i
		}

		System.out.println("The sum is: " + sum);

	}

}
