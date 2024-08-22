package com.neotech.review08_Abstraction;

public class World {

	
		public static void main(String[] args) {

			// We cannot create an object from an abstract class
			// Human h1 = new Human("Paul");

			// up-casting and down-casting
			// can ONLY be done because of INHERITANCE
			Human a1 = new Albanian("Tima"); // up-casting
			a1.talk();
			a1.sleep();
			// a1.albanianDance();

			Human t1 = new Turkish("Maya"); // up-casting
			t1.talk();
			t1.sleep();
			// t1.makeBaklava();

			Turkish tur = (Turkish) t1; // down-casting
			tur.makeBaklava();

			// HW for hard-working student
			// Create an array of 5 Humans, and fill it.
			// Iterate the array with an enhanced for loop
			// execute the talk and sleep method for all of them
		}

	}


