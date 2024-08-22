package com.neotech.lesson18;

import java.util.Arrays;

public class Homework2 {

	public static void main(String[] args) {
		String sentence = "Today is Tuesday and we have a Java Class!!!";
		String[] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
//		Homework2 hw2 = new Homework2();
		for(String word: words) {
			StringBuffer strBuffer = new StringBuffer(word);
			System.out.print(strBuffer.reverse() + " ");
			//2nd way
//			System.out.print(hw2.reverseString(word) + " ");
			
		}

	}
	
	String  reverseString(String input) {
		char[] charArray = input.toCharArray();
		String reversedStr = "";
		
		for(int i=charArray.length - 1; i>=0; i--) {
			reversedStr += charArray[i];
		}
		
		return reversedStr;
	}

}
