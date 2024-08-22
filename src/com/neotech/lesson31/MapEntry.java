package com.neotech.lesson31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {

		Map<String, Integer> months = new LinkedHashMap<>();

		months.put("Jan", 31);
		months.put("Feb", 29);
		months.put("Mar", 31);
		months.put("Arp", 30);

		System.out.println(months);
		System.out.println("the size of my map is:" + months.size());

		// Entry<String, Integer> --> an entry object of String to Integer
		Set<Entry<String, Integer>> entries = months.entrySet();
		System.out.println(entries);

		// now we can iterate over our entries object using either a for loop
		// or an iterator object
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry);
			System.out.println(entry.getKey() + " -->" + entry.getValue());
		}

		System.out.println("------------------------");

		// lets use the iterator now
		Iterator<Entry<String, Integer>> it = entries.iterator();

		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();

			System.out.println("This is the entry:" + entry);

			System.out.println(entry.getKey() + " -->" + entry.getValue());
		}

	}

}
