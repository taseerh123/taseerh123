package com.neotech.lesson16;

public class StringRegularExpressions {

	public static void main(String[] args) {
		String greeting = " Good Evening";
		
		String newGreeting = greeting.replace('E', 'e');
		System.out.println(greeting);
		System.out.println(newGreeting);
		String anotherGreeting = greeting.replace("Evening", "Afternoon");
		System.out.println(anotherGreeting);
		String replaceMultiple = greeting.replace('G', 'g').replace('E', 'E');
		System.out.println(replaceMultiple);
		
		String combination = "My phone is: 345-678-1010";
		String combination2 = combination.replaceAll("[0-9]","*");
		System.out.println(combination2);
		String combination3 = combination.replaceAll("[a-z]", "+");
		System.out.println(combination3);
		String combination4 = combination.replaceAll("[A-Z]", "+");
		System.out.println(combination4);

		String combination5 = combination.replaceAll("[a-zA-Z]", "+");
		System.out.println(combination5);
		
		String combination6 = combination.replaceAll("[^0-9]", "");
		System.out.println(combination6);
		
		String combination7 = combination.replaceAll("[0-9a-zA-Z]", "=");
		System.out.println(combination7);
		String combination8 = combination.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(combination8);

	}

}
