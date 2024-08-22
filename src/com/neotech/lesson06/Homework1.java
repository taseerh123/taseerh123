package com.neotech.lesson06;

public class Homework1 {

	public static void main(String[] args) {
		boolean hasAllergy = true; // if it is false it will print "You are healthy"
		boolean peanutAllergy = true;
		boolean lactoseAllergy = false;
		boolean beeAllergy = true;
		boolean seafoodAllergy = true;
		
		if (hasAllergy) { // this part will execute if hasAllergies  is true
			
			if(peanutAllergy) {
				System.out.println("Do not eat peanuts");
			}
			
			if (lactoseAllergy) {
				System.out.println("Do not drink milk!");
			}
			if (beeAllergy) {
				System.out.println("Stay away from bees");
			}
			if (seafoodAllergy) {
				System.out.println("Do not eat seafood");
			}
				
			System.out.println("You have allergies");
		} else {
			System.out.println("You are healthy!");
		}
	}

}
