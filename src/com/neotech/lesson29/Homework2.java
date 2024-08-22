package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework2 {

	public static void main(String[] args) {
		
			// Create an arrayList of even numbers from 1 to 50. 
			// Using Iterator remove any number that is divisible by 5 from that arrayList.

			ArrayList<Integer> numbers = new ArrayList<>();

			//start at 2 and increment by 2 (always jumping to the next even number)
			for (int i = 2; i <= 50; i = i + 2)
			{
				numbers.add(i);
			}
			
			System.out.println(numbers);
			
			//creating an iterator:
			Iterator<Integer> it = numbers.iterator();
			
			//hasNext() --> checks if there is a next element
			//next() --> it moves the cursor to the next element
			//remove() --> removes the element we are currently pointing at.
			
			while(it.hasNext())
			{
				Integer  num = it.next(); //return the element at the current pointer 
										// and it increments the pointer
				
				if(num % 5 == 0)
				{
					it.remove(); //it will remove the last returned element
				}
			}
			
			
			System.out.println(numbers);
			
			
			

	}

}
