package com.neotech.lesson29;

import java.util.ArrayList;

public class Homework1 {

	public static void main(String[] args) {
		// Create an arrayList of drinks. If any drink has letter "a" or "e" 
		// replace it with water. 

		
		ArrayList<String> drinks = new ArrayList<>();
		//[]
		drinks.add("coffee");//[coffee]
		drinks.add("soda"); //[coffee, soda]
		drinks.add("milk");//[coffee, soda, milk]
		drinks.add("tea"); //[coffee, soda, milk, tea]
			//by default add() will add the element at the end of the arrayList
		drinks.add(1, "water");//[coffee, water, soda, milk, tea]
			//if an index is specified, the element will be inserted on that index 
			//and Java will take care of changing the index of all affected elements
		
		System.out.println(drinks);
		
		
		/*
		LinkedList<String> drinksLL = new LinkedList<>();
		//[]
		drinksLL.add("coffee");//[coffee]
		drinksLL.add("soda"); //[coffee, soda]
		drinksLL.add("milk");//[coffee, soda, milk]
		drinksLL.add("tea"); //[coffee, soda, milk, tea]
			//by default add() will add the element at the end of the arrayList
		drinksLL.add(1, "water");//[coffee, water, soda, milk, tea]
			//if an index is specified, the element will be inserted on that index 
			//and Java will take care of changing the index of all affected elements

		System.out.println(drinksLL);
*/
		
		
		//using for each
		for (String drink : drinks)
		{
			//check if it contains the letter a or e
			if(drink.contains("a") || drink.contains("e"))
			{
				//replace the drink with water
				//we are not updating the list
				drink = drink.replace(drink, "water");
			}
			System.out.print(drink + " ");
		}
		
		System.out.println();
		
		//was the list updated??
		System.out.println(drinks);
		
		
		//with indexed for loop
		for (int i = 0; i < drinks.size(); i++)
		{
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e"))
			{
				//we are updating the list elements
				drinks.set(i, "water");
			}
		}
		
		System.out.println(drinks);
		
	

	}

}
