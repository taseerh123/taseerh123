package com.neotech.review05;

public class ReplaceDemo {
	public static void main(String[] args) {
		String longStr = "I am very happy today because today is not Monday";
		
		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);
		
		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);
		
		System.out.println("------------------");
		
		anotherStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr);
		String ssn = "492-73-4156";
		System.out.println(ssn);
		String SSN = "***-**-" + ssn.substring(7);
		System.out.println(SSN);
		
	}

}
