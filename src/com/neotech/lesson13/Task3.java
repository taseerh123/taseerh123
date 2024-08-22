package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) {
		
//				Create a 2D array of integer type and store numbers in 3 rows 
//				and 3 columns. Print the sum of all numbers.

				int[][] numbers = {
						{2,3,4,5,6},
						{7, 8}, 
						{10, 11, 15}
				};
				
				//indexed for loop
				
				int sum = 0;
				
				for (int row = 0; row < numbers.length; row++)
				{
					for (int col = 0; col < numbers[row].length; col++)
					{
						sum += numbers[row][col];
					}
				}
				
				System.out.println("The total sum is: " + sum);
				
				//using for each
				
				int sum2 = 0;
				
				for (int[] row : numbers)
				{
					for (int colValue : row)
					{
						System.out.print(colValue + " ");
						sum2 += colValue;
					}
				System.out.println();
				}
				
				
				System.out.println("The total sum is: " + sum2);
			}

		

	}


