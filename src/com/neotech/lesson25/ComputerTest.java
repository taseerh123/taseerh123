package com.neotech.lesson25;

public class ComputerTest {

	public static void main(String[] args) {
		Apple apple = new Apple("Apple");
		HP hp = new HP("HP", "Red");

		// arrays can only hold elements of the same type
		int[] intArray = { 1, 3, 4, 5, 6 };

		Computer c1 = new Dell("Dell");
		Computer c2 = new Lenova("Lenova");
		// one way of storing Computer objects in array
		Computer[] compArray = { c1, c2 };

		// another way
		Computer[] compArray2 = { new Apple("Apple"), new Dell("Dell"), new HP("HP", "Black"), new Lenova("Lenova") };

		for (Computer comp : compArray2) {
			System.out.println("brand is:" + comp.brand);
			comp.run();

			// they wont work because they dont exist in Computer class
			// comp.safe();
			// comp.save();
		}

		Apple[] appArray = { new Apple("Apple1"), new Apple("Apple2"), apple };

	}

}
