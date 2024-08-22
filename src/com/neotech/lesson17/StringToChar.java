package com.neotech.lesson17;

import java.util.Arrays;

public class StringToChar {

	public static void main(String[] args) {
		String sentence = "Today is Thursday and we're learning JAVA!!!";
		char[] charArray = sentence.toCharArray();
		
		for(char c : charArray)
		{
			System.out.print(c + "|");
		}
		System.out.println();
		System.out.println(Arrays.toString(charArray));
		
		System.out.println("The sentence length is: " + sentence.length());
		System.out.println("The array length is: " + charArray.length);
		
		for(int i = charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}
		

	}

}
