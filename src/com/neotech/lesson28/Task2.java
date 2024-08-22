package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
		// Create arrayList with 6 different words.
				// Remove every word that end with 'e'. Use iterator.

				ArrayList<String> words = new ArrayList<>();
				words.add("Coffee");
				words.add("Tea");
				words.add("Milk");
				words.add(0, "Orange juice");
				words.add(1, "Apple juice");
				words.add("Water");
				System.out.println(words);

				Iterator<String> it = words.iterator();

				while (it.hasNext()) {
					String word = it.next();

					if (word.endsWith("e")) {
						it.remove();
					}
				}

				System.out.println(words);


	}

}
