package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {
	public static void main(String[] args) {

		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(3.7);
		numbers.add(2.4);
		numbers.add(3.3);
		numbers.add(6.5);
		// numbers.add("Abeera"); Compiler error: You may only store Double in your list
		// numbers.add(4); Compiler error: You may only store Double in your list

		System.out.println(numbers);

		// lets replace the items
		numbers.set(1, 4.4);

		// numbers.set(6, 1.1); Runtime error: IndexOutOfBoundsException

		// lets remove an item from the list using index number
		numbers.remove(0);
		System.out.println(numbers);

		// let remove an item from the list using the object
		numbers.remove(3.4);

		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(1);
		intArray.add(1);
		intArray.add(1);
		intArray.add(2);

		intArray.remove(1);
		intArray.remove(Integer.valueOf(1));
		System.out.println(intArray);

		// lets find an element in the list
		System.out.println(numbers.get(1));

		// for loop
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " - ");
		}

		System.out.println();

		// enhanced for loop
		for (Double number : numbers) {
			System.out.print(number + " - ");
		}

		System.out.println("-------------------------");

		// non-generic ArrayList (the type is not specified)
		ArrayList al2 = new ArrayList();

		// generic ArrayList
		ArrayList<String> al3 = new ArrayList<>();

		al2.add(3); // adding an integer
		al2.add("Uygar"); // adding a string
		al2.add(3.4); // adding a double
		al2.add('$'); // adding a char

		for (Object item : al2) {
			System.out.print(item + " - ");
		}
	}
}
