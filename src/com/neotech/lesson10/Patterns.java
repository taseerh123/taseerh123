package com.neotech.lesson10;

public class Patterns {

	public static void main(String[] args) {
		
		int size = 5;
		
		for (int row = 0; row < size; row++)
		{
		// inner loop is responsible for columns
			for(int col = 0; col <= row; col++)
			{
				// i took care of rows, need to take care of columns as well
				//loop 1; i must make sure, that on the first row, this only runs 1 iteration
				// loop 2: i must make sure, this on second row runs only twice
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}

		
		
		for (int row = size -1; row > 0; row--)
		{
		// inner loop is responsible for columns
			for(int col = 0; col < row; col++)
			{
				// i took care of rows, need to take care of columns as well
				//loop 1; i must make sure, that on the first row, this only runs 1 iteration
				// loop 2: i must make sure, this on second row runs only twice
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}
