package com.neotech.lesson13;

public class RetrieveingValuesUsingForEachLoops {

	public static void main(String[] args) {
		String[][] animals = {
				{"cat", "dog", "bird"},
				{"tiger", "lion", "bear"},
				{"salmon", "shrimp", "seabass"}
		};
		
		for(int row = 0; row < animals.length; row++)
		{
			for (int col = 0; col < animals[row]. length; col++)
			{
				System.out.print(animals[row][col]+ " ");
			}
			System.out.println();
			
		}
		System.out.println("---------------");
		for (String [] row : animals)
		{
			for (String col : row)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

}
