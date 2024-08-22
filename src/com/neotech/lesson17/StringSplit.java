package com.neotech.lesson17;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		String sentence = "Today is Thursday and we're learning JAVA!!!";
		
		String [] result = sentence.split(" ");
		
		for(String word : result) {
			System.out.print(word + "-");
		}
		System.out.println();
		
		System.out.println("The sentence has " + result.length + " words!");
		
		String[] array = sentence.split("y");
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i] + " + ");
		}
		
		
		
		String list = "1Fasry2Iana3Mona4Emrah";
		String[] names = list.split("[0-9]");
		for (String name : names)
		{
			System.out.print(name + "\t");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(names));
		
	}

}
