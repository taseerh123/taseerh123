package com.neotech.review04;

public class World {

	public static void main(String[] args) {
		Baby baby1 = new Baby();
		baby1.name = "Bashir";
		baby1.weight = 4;
		System.out.println("The name of baby1 is -> "+ baby1.name);
		System.out.println("The weight of baby1 is -> " + baby1.weight);
		
		baby1.hairColor = "Black";
		baby1.gender = 'M';
		System.out.println("The hair color of baby1 is -> " + baby1.hairColor);
		
		System.out.println("-------------------");
		Baby baby2;
		baby2 = new Baby();
		baby2.name = "Umut";
		baby2.gender = 'M';
		baby2.weight = 7;
		baby2.hairColor = "Brown";
		
		System.out.println("The name of baby2 is -> "+ baby2.name);
		System.out.println("The weight of baby2 is -> " + baby2.weight);
		System.out.println("The hair color of baby2 is -> " + baby2.hairColor);
		baby1.cry();
		baby2.cry();
		baby1.displayInformation();
		
	}

}
