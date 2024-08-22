package com.neotech.lesson18;

public class CatDemo {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.name = " Fluffy";
		cat1.weight = 15;
		cat1.color = "brown";
		
		cat1.sayMeow();
		cat1.displayCatInfo();
		
		Cat cat2 = new Cat();
		cat2.name = "tziri";
		cat2.weight = 9;
		cat2.color = "gray";
		
		cat2.displayCatInfo();
		
		System.out.println(cat1.name + " is " + cat1.color );
		System.out.println(cat2.name + " is " + cat2.color );
		
		cat1.name = "Garfield";
		System.out.println(cat1.name);
		
		cat1.displayCatInfo();
		
		
		
	}

}
