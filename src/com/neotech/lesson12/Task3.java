package com.neotech.lesson12;

public class Task3 {

	public static void main(String[] args) {
		String[] countries = {"Morroco", "USA", "Turkiye", "Senegal", "Qatar"};
		
		//indexed for loop
		for(int i=0; i< countries.length; i++) {
			if(countries[i].equals("Morroco")) {
				System.out.println(countries[i] + "- Rabat");
			}else if (countries[i].equals("USA")) {
				System.out.println(countries[i] + "- Washignton");	
			}else if (countries[i].equals("Turkiye")) {
				System.out.println(countries[i] + "- Ankara");
		}else if (countries[i].equals("Senegal")) {
			System.out.println(countries[i] + "- Dakar");
		}else if (countries[i].equals("Qatar")) {
			System.out.println(countries[i] + "- Doha");
		}else {
			System.out.println("We donot know!");
		}
	}
		System.out.println("===========");
		for(String country : countries) {
			 
				if(country.equals("Morroco")) {
					System.out.println(country + "- Rabat");
				}else if (country.equals("USA")) {
					System.out.println(country + "- Washignton");	
				}else if (country.equals("Turkiye")) {
					System.out.println(country + "- Ankara");
			}else if (country.equals("Senegal")) {
				System.out.println(country + "- Dakar");
			}else if (country.equals("Qatar")) {
				System.out.println(country + "- Doha");
			}else {
				System.out.println("We donot know!");
			}
	
		}

}
}
