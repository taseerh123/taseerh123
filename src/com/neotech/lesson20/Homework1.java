package com.neotech.lesson20;

import java.util.Scanner;

public class Homework1 {
	private static String getVowels (String str) {
		String result = str.replaceAll("[^aeiouAEIOU]", "");// regular expression can be found from web
		
		
		
		return result;
		}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		String onlyVowels = getVowels(str);
		System.out.println(onlyVowels);
		

	}

}
