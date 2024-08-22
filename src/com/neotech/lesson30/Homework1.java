package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {

	public static void main(String[] args) {

		//Create a Set collection in which you need to add names of the countries. 
		//In this set we want all objects to be sorted in alphabetical order. 
		//Using 2 different ways retrieve all elements from set.

		Set<String> countries = new TreeSet<>();
		
		countries.add("Canada");
		countries.add("Argentina");
		countries.add("Brazil");
		countries.add("Columbia");
		countries.add("Spain");
		countries.add("Portugal");
		countries.add("Turkiye");
		
		
		System.out.println(countries);
		
		//for each loop
		for (String country : countries)
		{
			System.out.println(country);
		}
		
		System.out.println("--------------------");
		
		//using an iterator
		Iterator<String> it = countries.iterator();
		
		while (it.hasNext())
		{
			//if we are just using the element once, then I don't have to create a local 
			//variable for the element
//			System.out.println(it.next());
		
			//if we are working with that element 
			String country = it.next();
			System.out.println(country.toUpperCase());
			//we can continue using the country variable more below
			
		}
		
		
		
		//for loop
		for (int i = 0; i < countries.size(); i++)
		{
		// System.out.println(countries.get(i));
		
		//Set --> has no index
		
		}

		
	}

}