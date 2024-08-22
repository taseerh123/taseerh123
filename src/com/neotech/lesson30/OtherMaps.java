package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {

		//TreeMap: will order pairs alphabetically according to the key
		Map<String, Integer> groceries = new TreeMap<>();
		
		groceries.put("Milk", 2);
		groceries.put("Bread", 3);
		groceries.put("Eggs", 12);
		//groceries.put(3, "Oil"); //CE: Key has to be a String and value an Integer!!!
		groceries.put("Oil", 3);
		groceries.put("Apples", 2);
		
		System.out.println(groceries);
		
		
		Set<String> keys = groceries.keySet();
		System.out.println(keys);
		
		
		Collection<Integer> values = groceries.values();
		System.out.println(values);
		
		
		//iterate through keys:
		for (String key : keys)
		{
			System.out.println(key + " - " + groceries.get(key));
		}
		
		//iterate with iterator
		Iterator<Integer> it = values.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
