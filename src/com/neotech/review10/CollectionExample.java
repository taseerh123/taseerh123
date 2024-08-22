package com.neotech.review10;

import java.util.*;

public class CollectionExample {
	// Collections Framework -- All interface and implementations
	// Collection Interface -- Only one interface
	// Collections class -- It is a helper/utility class

	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<>(); // Up-casting
		numbers.add(92);
		numbers.add(36);
		numbers.add(83);
		numbers.add(19);
		numbers.add(47);
		numbers.add(51);

		System.out.println(numbers);

		Integer min = Collections.min(numbers);
		System.out.println("min -> " + min);

		System.out.println("max -> " + Collections.max(numbers));

		// SET cannot be sorted/ordered
		// Collections.sort(numbers);

		// LIST can be sorted/ordered
		List<Integer> numberList = new ArrayList<>(numbers);
		System.out.println("List before sorting -> " + numberList);

		Collections.sort(numberList);
		System.out.println("List after sorting -> " + numberList);

		System.out.println("--------------------------------");

		// HW for Elma. Check if you can remove duplicates using the Collections class

		List<String> students = new LinkedList<>();
		students.add("Paul");
		students.add("Jackeline");
		students.add("Tima");
		students.add("Emre");
		students.add("Sufiyan");
		System.out.println(students);

		String first = Collections.min(students);
		System.out.println("first -> " + first);
		System.out.println("last -> " + Collections.max(students));

		Collections.sort(students);
		System.out.println(students);

		System.out.println("--------------------------------");

		int[] arr = { 9, 2, 5, 1, 8 };
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

	}
}
