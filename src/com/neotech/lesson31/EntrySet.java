package com.neotech.lesson31;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {

		Map<String, String> countries = new TreeMap<>();

		countries.put("France", "Paris");
		countries.put("Turkiye", "Ankara");
		countries.put("Kosova", "Prishtina");
		countries.put("USA", "DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");

		System.out.println(countries);

		Set<Entry<String, String>> allEntries = countries.entrySet();
		System.out.println(allEntries);

		// print all keys and values in UPPERCASE
		for (Entry<String, String> entry : allEntries) {
			String key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key.toUpperCase() + " --> " + value.toUpperCase());
		}

		System.out.println("---------------------");

		// now lets do it using an iterator
		// what is the type of each item of the iterator: Entry<String, String>

		Iterator<Entry<String, String>> it = allEntries.iterator();

		while (it.hasNext()) {
			Entry<String, String> entry = it.next();
			System.out.println(entry.getKey().toUpperCase() + " --> " + entry.getValue().toUpperCase());
		}
	}

}
