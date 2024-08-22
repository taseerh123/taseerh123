package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {
	/*
	Create a Map from array of cities that will sort keys in alphabetical order. 
	
	String[] cities = {"Ankara", "Tirana", "Baku", "DC", "Paris"};
	
	As a key store the name of the city and as a value store the length of the city 
	(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
	- If any city name is more than 5 characters remove that city . 
	
	*/
	public static void main(String[] args) {
		String[] cities = { "Ankara", "Tirana", "Baku", "DC", "Paris" };

		// create a map with city name as key, and its length as value
		Map<String, Integer> mc = new TreeMap<>();

		for (String city : cities) {
			mc.put(city, city.length());
		}

		System.out.println(mc);

		Set<Entry<String, Integer>> allEntries = mc.entrySet();

		// lets use the iterator object to loop over the items of the collection
		Iterator<Entry<String, Integer>> it = allEntries.iterator();

		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();

			// check if the length is more than five
			if (entry.getValue() > 5) {
				it.remove();
			}
		}

		// print the collection items
		System.out.println(allEntries);
		System.out.println(mc);

	}

}
