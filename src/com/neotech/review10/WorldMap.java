package com.neotech.review10;

import java.util.*;

public class WorldMap {

	public static void main(String[] args) {

		Map<String, String> europe = new TreeMap<>(); // ordered by the key
		europe.put("Italy", "Rome");
		europe.put("Spain", "Madrid");
		europe.put("Greece", "Athens");
		System.out.println(europe);

		Map<String, String> africa = new LinkedHashMap<>(); // order is preserved
		africa.put("Kenya", "Nairobi");
		africa.put("Gambia", "Banjul");
		africa.put("Senegal", "Dakar");
		System.out.println(africa);

		Map<String, String> asia = new HashMap<>(); // random order
		asia.put("Philippines", "Manila");
		asia.put("Bhutan", "Thimpu");
		asia.put("Turkiye", "Ankara");
		System.out.println(asia);

		// HW1 iterate europe by getting the keys
		// HW2 iterate africa by getting the values

		System.out.println("--------WORLD--------");

		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);

		System.out.println("WORLD -> " + world);
		System.out.println("SIZE -> " + world.size());

		Map<String, String> map2 = world.get(2); // get the element with index 2
		System.out.println("The object/element with index 2 is -> " + map2);

		System.out.println("--------Let's iterate the WORLD--------");

		for (Map<String, String> continent : world) {
			// System.out.println(continent);

			Set<String> countryNames = continent.keySet();

			for (String country : countryNames) {
				System.out.println(country + " -> " + continent.get(country));
			}

			System.out.println("--------");
		}

		// HW only for whoever is curious
		// Do it with a nested while loop

	}

}
