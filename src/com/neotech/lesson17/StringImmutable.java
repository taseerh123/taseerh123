package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {
		 String str = "Hello";
		 
		 str.concat("World!");
		 
		 System.out.println(str);
		 str.toUpperCase();
		 
		 str = str.concat("World!");
		 System.out.println(str);
		 
		 int a = 10;
		 a = 5;
		 
		 String str2 = "Hello";

	}

}
