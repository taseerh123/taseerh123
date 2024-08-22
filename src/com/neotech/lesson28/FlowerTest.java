package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		Flower[] flowerArray = { new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower") };

		// flowerArray[3] = new Rose("Rose2");

		// Arrays are fixed sized objects

		ArrayList<Flower> flowerList = new ArrayList<>();
		flowerList.add(new Rose("Rose"));
		flowerList.add(new Tulip("Tulip"));
		flowerList.add(new Sunflower("Sunflower"));
		// can i do this?
		flowerList.add(flowerArray[0]);

		// iterate over the flower list
		for (Flower flower : flowerList) {
			flower.bloom();
		}

		System.out.println("----------------");

		// using indexed for loop
		for (int i = 0; i < flowerList.size(); i++) {
			flowerList.get(i).bloom();

			// Flower flower = flowerList.get(i);
			// flower.bloom();
		}

		// using the iterator object

		System.out.println("----------------");

		Iterator<Flower> fi = flowerList.iterator();

		while (fi.hasNext()) {
			Flower flower = fi.next();
			flower.bloom();

			// fi.next().bloom();
		}

	}

}
