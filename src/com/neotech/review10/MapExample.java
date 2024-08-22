package com.neotech.review10;

import java.util.*;

public class MapExample {
	// Map
	// HashMap | LinkedHashMap | TreeMap | HashTable

	public static void main(String[] args) {

		Map<Integer, String> phonebook = new HashMap<>();
		phonebook.put(912313145, "Brad Pitt");
		phonebook.put(123456789, "Donald Trump");
		phonebook.put(111111111, "Joe Biden");
		phonebook.put(345334533, "Brad Pitt");
		phonebook.put(283492797, "Taylor Swift");

		// It will replace Taylor Swift with Paul
		phonebook.replace(283492797, "Paul");

		// Another way to replace
		// phonebook.put(283492797, "Paul");

		System.out.println(phonebook);

		// Map is one-directional, from the KEY to the VALUE
		// There is NO way to go from the value to the key

		String name = phonebook.get(283492797);
		System.out.println(name + " is calling...");

		name = phonebook.get(111);
		System.out.println(name + " is calling...");

		boolean containsK = phonebook.containsKey(123456789);
		System.out.println("The phonebook contains 123456789 -> " + containsK);

		boolean containsV = phonebook.containsValue("Taylor Swift");
		System.out.println("Taylor Swift is in my phonebook -> " + containsV);

		phonebook.remove(123456789); // Will remove the pair/entry from the map

		System.out.println("The size of my phonebook is -> " + phonebook.size());

		// You CANNOT iterate the MAP

		// Let's get all the KEYS and store them into SET
		System.out.println("--------phonebook.keySet()--------");

		Set<Integer> numbers = phonebook.keySet();
		System.out.println(numbers);

		Iterator<Integer> itNums = numbers.iterator();
		while (itNums.hasNext()) {
			Integer number = itNums.next();

			// Find the name/value by using the number/key
			String personName = phonebook.get(number);
			System.out.println(number + " -> " + personName);
		}

		// Task until 2:15PM
		// Get the values and iterate them using an enhanced for loop
		// Try to get the number by using the name!!!

		// Let's get all the VALUES and store them into COLLECTION
		System.out.println("--------phonebook.values()--------");

		Collection<String> names = phonebook.values();
		System.out.println(names);

		for (String personName : names) {
			System.out.println(personName);

			// Map is one-directional, from the KEY to the VALUE
			// From the value we CANNOT find the key
			// phonebook.get(personName);
		}

	}
}
