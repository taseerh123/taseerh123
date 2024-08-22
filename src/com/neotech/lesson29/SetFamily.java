package com.neotech.lesson29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {

		//HashSet --> no duplicates, no insertion order, accepts null element
		Set<String> veggies = new HashSet<>();
		
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("onion");
		veggies.add("tomato");
	//	veggies.add(null);
		
		System.out.println(veggies);
		
		
		//Set<String> veggies = new HashSet<>();
		//Set is an interface --> has no implementation 
			//-- whatever action is performed, it is defined by the type of object casted
		
		
		//LinkedHashSet --> no duplicates, maintains insertion order, accepts null element
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("banana");
		//fruits.add(null);
		
		System.out.println(fruits);
		
		
		
		//TreeSet --> no duplicates, ascending order, null not accepted 
		Set<String> food = new TreeSet<>();
		
		food.add("soup");
		food.add("eggs");
		food.add("fish");
		food.addAll(veggies);
		food.addAll(fruits);
		//food.add(null); --> TreeSet will not accept null
		//food.add(""); //empty string is different than null, so it will be accepted
		System.out.println(food);
		
	}

}
