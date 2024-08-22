package com.neotech.lesson06;

public class LogicalOR {

	public static void main(String[] args) {
		//If a person has any kind of allergy, say you have allergies
		// otherwise say you are healthy
		
		boolean hasAllergy = true; 
		boolean peanutAllergy = false;
		boolean lactoseAllergy = false;
		boolean beeAllergy = false;
		boolean seafoodAllergy = true;
		
 if (hasAllergy && (peanutAllergy|| lactoseAllergy || beeAllergy || seafoodAllergy )) {
	 System.out.println("you are allergic to something");
 } else {
	 System.out.println("you are not allergic to anything");
 }
	}

}
   