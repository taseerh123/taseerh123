package com.neotech.lesson17;

public class Task1 {

	public static void main(String[] args) {
		String str = "Is it saturday? Is it raiing? Do we have a Java Class today?";
		
		String[] array = str.split("[?]");
		System.out.println("The number of sentences is: " + array.length);
		
		String str2 = "Is it Thursday. Is it raining? We have a Java Class today!";
		String[] array2 = str.split(".?!");
		
		
		for (String s : array2)
		{
			System.out.println(s);
		}
		
		System.out.println(array2.length);
		

	}

}
