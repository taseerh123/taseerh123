package com.neotech.lesson31;

import java.util.LinkedHashMap;
import java.util.Map;

public class Homework1 {
	/*
	 Create a map of car models that you have in your garage and for each model the number of car 
	 you have.
	So the Key is the model and the value is the number of cars. Use LinkedHashMap.
		For example:
		"BMW" -> 2
		"Mercedes" -> 3
		"Audi" -> 3
		"Ferrari" -> 1
		
		- Check how many entries you have.
		- Update the number of Audis to 5.
		- Add a new model with any number of cars.
		- Check how many Ferraris you have.
		- Check if you have Honda in your map.
		- Remove Mercedes from the map.
		- Get all models from the map. (use keySet() method)
		
		Note: After each step print the map.
	 */

	public static void main(String[] args) {

		// Map<K, V> -->K: key, V: value
		Map<String, Integer> cars = new LinkedHashMap<>();

		cars.put("BMW", 2);
		cars.put("Audi", 3);
		cars.put("Ferrari", 1);
		cars.put("Mercedes", 4);

		// Check how many entries you have.
		System.out.println("how many entries do i have?");
		System.out.println(cars.size());

		// Update the number of Audis to 5.
		// cars.put("Audi", 5); // if audi exists, this will update
		// otherwise it will add

		cars.replace("Audi", 5); // if audi exists, this will update it
									// otherwise, nothing will happen

		// Add a new model with any number of cars.
		cars.put("Tesla", 2);
		System.out.println(cars);

		// Check how many Ferraris you have.
		System.out.println("Number of Ferraris:");
		System.out.println(cars.get("Ferrari"));

		// Check if you have Honda in your map.
		System.out.println("Chekc if i have a honda:");
		System.out.println(cars.containsKey("Honda"));

		// Remove Mercedes from the map.
		System.out.println("remove mercedes");
		cars.remove("Mercedes");
		System.out.println(cars);

		// Get all models from the map. (use keySet() method)
		System.out.println("all models");
		System.out.println(cars.keySet());

	}

}
