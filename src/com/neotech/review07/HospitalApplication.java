package com.neotech.review07;

public class HospitalApplication {

	
		
		public static void main(String[] args) {

			Doctor d1 = new Doctor("Ebru", 110000, "TR842");
			d1.checkUp("Tima");

			// These are variables and methods of the child class
			// d1.dermId = "ABC";
			// d1.applySkinTreatment();

			System.out.println("--------------------------------");

			// Not possible, because constructors are NOT inherited
			// Dermatologist d2 = new Dermatologist("Fulya", 95000, "US290");

			// Creating a Dermatologist with NO initial information
			Dermatologist d3 = new Dermatologist();
			d3.name = "Emrah";
			d3.salary = 150000;
			d3.licenceId = "US123";
			d3.dermId = "D702";

			d3.checkUp("Ibrahim");
			d3.applySkinTreatment();

			System.out.println("--------------------------------");

			// Creating a Dermatologist with 4 parameters
			Dermatologist d4 = new Dermatologist("Iana", 200000, "MD813", "D007");
			d4.checkUp("Bunmi");
			d4.applySkinTreatment();

			// The Constructors are NOT inherited
			// Dermatologist d5 = new Dermatologist("Abiy", 55000, "US918");

	}

}
