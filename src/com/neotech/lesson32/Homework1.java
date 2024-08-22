package com.neotech.lesson32;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework1 {

	public static void main(String[] args) {
		// Create a Map that will store Employee name and salary. 
		// Write a logic to retrieve an employee who gets the highest salary. 
		// Output should be in the below format
		// - John Smith=$100000

			//	K,		V
		Map<String, Integer> empMap = new LinkedHashMap<>();
		
		empMap.put("Emrah", 10000);
		empMap.put("Uygar", 15000);
		empMap.put("Jackeline", 5000);
		empMap.put("Iana", 7000);
		empMap.put("Sabah", 4000);
		
		System.out.println(empMap);
		
		//how to find the highest salary
		Collection<Integer> salaries = empMap.values();
		
		int max = 0;
		
		for (int s : salaries)
		{
			if (s > max)
			{
				max = s;
			}
		}
		
		System.out.println("The highest salary is " + max);
		
		//Another short way to find the highest number in a collection
		
		System.out.println(Collections.max(salaries));
		
		
		System.out.println("--------------------------");
		
		
		Set<Entry<String, Integer>> entrySet = empMap.entrySet();
		//Entry<String, Integer> -- used to represent an entry of the map
		
		//if you look at the result, you will see the same data
			//the first is a map 	{}
			//the second is a set 	[]
		System.out.println(empMap);
		System.out.println(entrySet);
		
		
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
	//one liner: Iterator<Entry<String, Integer>> it = empMap.entrySet().iterator();
		
		//I can assume that the first entry is the  maxEntry
		Entry<String, Integer> maxEntry = it.next();
		
		//loop through the other entries
		//compare the salaries (values) and then update the maxEntry
		while(it.hasNext())
		{
			Entry<String, Integer> entry = it.next();
			
			if(entry.getValue() > maxEntry.getValue())
			{
				//if the current entry has a higher salary, then update maxEntry
				maxEntry = entry;
			}
			
		}
		
		
		System.out.println("The highest is: " + maxEntry.getKey() + " - " + maxEntry.getValue());
		
		
		
		//this task can be done using the keys only as well!!!
	}

}
