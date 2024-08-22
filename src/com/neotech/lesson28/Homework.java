 package com.neotech.lesson28;

import java.util.ArrayList;

public class Homework {

	public static void main(String[] args) {

		/*
		Create a ArrayList that will store 5 names into it.
		▪ Find out whether the given ArrayList is empty or not?
		▪ Check whether the specific name is present in an ArrayList or not?
		▪ Find the size of your ArrayList and print all values from the ArrayList
		*/

		// declare the ArrayList
		ArrayList<String> names = new ArrayList<>();

		// lets add some names in our arraylist
		names.add("Abit");
		// ["Abit"]
		names.add("Iana");
		// ["Abit","Iana"]
		names.add("Kevin");
		names.add("Elnur");
		names.add("Tima");
		// ["Abit","Iana","Kevin","Elnur","Tima"]

		// Check if the array list is empty
		System.out.println("Is the list emtpy? " + names.isEmpty());

		// check if specific item exists in list
		System.out.println("Does it contait Kevin? " + names.contains("Kevin"));

		// lets find the size of the list
		System.out.println("There are " + names.size() + " items in my list");

		System.out.println(names);

		for (String name : names) {
			System.out.print(name + " - ");
		}

	}

}
