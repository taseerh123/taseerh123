package com.neotech.lesson11;

public class Recap {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++)
		{//ist row: 4 spaces +  1 star
			// 2nd row and so on
			
			
			for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			
			//loop for stars
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("* ");
			}
			
			
			
		System.out.println();	
		}
		
	}

}
