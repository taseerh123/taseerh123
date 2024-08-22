package com.neotech.lesson16;

public class StringMethodsMore {

	public static void main(String[] args) {
		String name = "Emrah";
		 char letter = name.charAt(0);
		 System.out.println("Letter: " + letter);
		 int index = name.indexOf('m');
		 System.out.println("The index of letter m is: " + index);
		 
		 String  name1 = "Sabah";
		 System.out.println("The index of a is: " + name1.indexOf('a'));
		 System.out.println("The last index of a is: " + name1.lastIndexOf('a'));
		 System.out.println("The index of ab is: " + name1.indexOf("ab"));
		 
		 
		 String message = "Today is raining!";
		 String substr = message.substring(9);
		 System.out.println(substr);
		 
		 String substr2 = message.substring(6, 8);
		 System.out.println(substr2);
		 
		 String substr3 = message.substring(0, 5);
		 System.out.println(substr3);
		 
	}

}
