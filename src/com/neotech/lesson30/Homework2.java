package com.neotech.lesson30;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {

	public static void main(String[] args) {
		//Create a Set of cities in which you want to make sure that insertion order 
		//is maintained.   ---> Set and insertion order ---> LinkedHashSet 
		// Using Iterator remove any city that starts with “A”;

		
		Set<String> cities = new LinkedHashSet<>();
		
		cities.add("New York");
		cities.add("Antalya");
		cities.add("Lahore");
		cities.add("Chicago");
		cities.add("Kashmir");
		cities.add("Delhi");
		cities.add("albany");
		
		System.out.println(cities);
		
		
		Iterator<String> it = cities.iterator();
		
		while(it.hasNext())
		{
			String city = it.next();
			
			
			//if we want it to be case insensitive
			//if(city.toUpperCase().startsWith("A"))
			if(city.toLowerCase().startsWith("a"))
			//if (city.startsWith("A"))
			{
				it.remove();
			}
			
		}

		System.out.println(cities);		
	}

}