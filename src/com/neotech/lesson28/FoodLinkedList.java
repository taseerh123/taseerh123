package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedList;

public class FoodLinkedList {

	public static void main(String[] args) {
		LinkedList<Food> foodList = new LinkedList<>();

		foodList.add(new Food("Salad", "Tomatoes", 100));
		foodList.add(new MexicanFood("Tacos", "Chicken", 300));
		foodList.add(new TurkishFood("Lahmacun", "Beef", 500));



		// lets loop over the items of the list using advanced for loop
		for (Food food : foodList) {
			System.out.println(food.foodType + " " + food.ingredients + " " + food.calories);
		}

		System.out.println("-----------------------");

		Iterator<Food> foodIterator = foodList.iterator();

		while (foodIterator.hasNext()) {
			Food f = foodIterator.next();
			System.out.println(f.foodType + " " + f.ingredients + " " + f.calories);
		}

	}

}
