package com.neotech.lesson08;

public class Task1 {

	public static void main(String[] args) {
		// How can I print only even numbers from 50 to 1
		//50 48 46 44.....2
		int x = 50;
		// the last true condition needs to be for x = 2
		while(x > 1)
		{
			System.out.print(x + " "); 
			
			x = x - 2;
		}
		System.out.println();
		//2nd way
		int y = 50;
		
		while (y > 1)
		{
			if(y % 2 == 0)
			{
				System.out.print(y + " ");
			}
			
			y--;
		}
	}

}
