package com.neotech.lesson16;

public class StringMethodsContinue {

	public static void main(String[] args) {
		String sentence = "Hope is what you live for!";
		boolean response = sentence.contains("Hope");
		System.out.println(response);
		System.out.println(sentence.toLowerCase().contains("hope"));
		String lower = sentence.toLowerCase();
		boolean check = lower.contains("hope");
		//equals
		String s1 = "Tuesday";
		String s2 = "tuesday";
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		boolean equals2 = s1.equalsIgnoreCase(s2);
		System.out.println(equals2);
	    boolean equalsUsingLower = s1.toLowerCase().equals(s2.toLowerCase());
	    System.out.println(equalsUsingLower);
	    
	    boolean starts = sentence.startsWith("Hope");
	    System.out.println("Does it start with Hope? " + starts);
	    boolean ends = sentence.endsWith("for!");
	    System.out.println("Does it end with for!? " + ends);
	}

}
