package com.neotech.review06_outside;

import com.neotech.review06.USA;

public class Mexico {

	public static void main(String[] args) {
		USA us = new USA();

		System.out.println("Accessing the variables from within Mexico");

		System.out.println("public -> " + us.bestSchool);

		// private, protected & default CANNOT be accessed from Mexico
		// System.out.println("default -> " + us.state);
		// System.out.println("protected -> " + us.mainState);
		// System.out.println("private -> " + us.capitalCity);

		System.out.println("--------------------------------");

		System.out.println("Accessing the methods from within Mexico");

		us.attendNeoTech();

		// private, protected & default CANNOT be accessed from Mexico
		// us.playNBA();
		// us.selectPresident();

	}

}
