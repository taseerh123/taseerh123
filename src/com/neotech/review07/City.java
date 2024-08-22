package com.neotech.review07;

public class City {
	
	// Only one public class in a file
	// The name of the public class should match the name of the file

		public static void main(String[] args) {

			City c1 = new City();
			Country c2 = new Country();
			Continent c3 = new Continent();

			System.out.println("name -> " + c3.name);

		}

	}

	class Country {

	}

	class Continent {
		public String name;

}
