package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Where are you from?");
		String country = myScanner.nextLine();

		// Using switch
		switch (country) {
		case "Albania":
		case "Kosova":
			System.out.println("You speak Albanian");
			break;
		case "USA":
		case "UK":
		case "Australia":
			System.out.println("You speak English");
			break;
		case "Kashmir":
			System.out.println("You speak Kashmiri");
			break;
		default:
			System.out.println("I will have to add that to the switch");
			break;

		}
// Using if -else if
		//.quals only for strongs and it compares the content of the string
		//.equalsIgnoreCase() it is same as .equals() but it is case insensitive
		if (country.equals("Albania") || country.equals("Kosova"))
		{
			System.out.println("You speak Albanian");
		}
		else if (country.equalsIgnoreCase("USA") || country.equalsIgnoreCase("UK")
				|| country.equalsIgnoreCase("Australia"))
		{
			System.out.println("You speak English");
		}
		else
		{
			System.out.println("I will have to add that to the else if conditions!");
		}
	}

}
