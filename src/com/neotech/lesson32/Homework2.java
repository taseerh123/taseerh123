package com.neotech.lesson32;


import java.util.LinkedHashSet;
import java.util.Set;

public class Homework2 {

	public static void main(String[] args) {
		//Create the collection that will store single unique objects of a String type 
		//in which order is preserved.
	    // Write a logic to concatenate all string from the collection.
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Today");
		set.add("is");
		set.add("Thursday");
		set.add("and");
		set.add("it's");
		set.add("too");
		set.add("hot!");
		
		//my first way:
		
		String output = "";
		
		for (String str : set)
		{
			output += str + " ";
		//	output.concat(str).concat(" ");//same as the line above
		//	System.out.println(output);
		}
		
		System.out.println(output);
		
		//what wrong with that???
		//Strings are immutable
		//it will create these strings: Today, Today is, Today is Thursday, Today is Thursday and
		//....Today is Thursday and it's too hot!
		
		StringBuilder sb = new StringBuilder();
		
		for (String str : set) 
		{
			sb.append(str).append(" ");
		}
		
		System.out.println(sb);
		
		
		}

}
