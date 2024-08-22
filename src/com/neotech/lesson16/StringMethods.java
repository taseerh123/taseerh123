package com.neotech.lesson16;

public class StringMethods {

	public static void main(String[] args) {
		
		int a = 5;
		String name = "Sabah";
		String name2 = new String("Sara");
		int size = name.length();
		System.out.println("The length of the bame is: " + size);
		
		String school = "Neotech";
		System.out.println("The length of the school is: " + school.length());
		
		String city = "New York";
		System.out.println(city);
		
		String sentence = "The size of"+ school + " is " + school.length();
		System.out.println(sentence);
		
		String firstName = "Neha";
		String lastName = " Dotiya";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		String fullName2 = firstName.concat(lastName);
		System.out.println(fullName2);
		
		String nameWithSpace = firstName + " " + lastName;
		System.out.println(nameWithSpace);
		String nameWithSpace2 = firstName.concat(" ").concat(lastName);
		System.out.println(nameWithSpace2);
		String methodChaining = firstName.concat(" ").concat(lastName).concat(" ").concat(school).toUpperCase();
		System.out.println(methodChaining );
		
		String str = " ";
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
		String str2 = "    Today     is tuesday and        we are " 
				+ "learning some cool     stuff      !!!     ";
		System.out.println(str2.trim());
		System.out.println("Length of str2 is: " + str2.length());
		System.out.println("Length of str2.trim() is: " + str2.trim().length());
		
		int[] num = {1,2,3,4};
		System.out.println("The array length is: " + num.length);
	}
	
	
}
