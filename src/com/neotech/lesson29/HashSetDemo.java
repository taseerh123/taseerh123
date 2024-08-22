package com.neotech.lesson29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> breakfast = new HashSet<>();
		
		breakfast.add("eggs");
		breakfast.add("cheese");
		breakfast.add("tea");
		breakfast.add("coffee");
		//adding a duplicate -- will be ignored - there is already a cheese element in the set
		breakfast.add("cheese");
		breakfast.add(null);
		
		
		int size = breakfast.size();
		System.out.println("The size of the set is: " + size);
		
		System.out.println(breakfast);
		//if you notice all the usage up to here, is exactly the same as with any list 
						//(excluding the first line)
		//HashSet 
			// - no promised order
			// - no duplicates
			// - allows the null element
		
		//order: [eggs, tea, coffee, cheese] -- why? doesnt maintain any order
		
		//loop through them using for each
		for (String item : breakfast)
		{
			System.out.print(item + " ");
		}
		System.out.println();
		
		
		//can I use an iterator??? Yes!
		
		Iterator<String> it = breakfast.iterator();
		
		while(it.hasNext())
		{
			//using .next() since I only want to use each object only once
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		

	}

}
