package com.neotech.lesson13;

public class Task2 {

	public static void main(String[] args) {
		
				/*
				 * Create a 2D array of integer type where you will store odd and even numbers
				 * in 3 rows and 4 columns. Develop a program which will identify/print the even
				 * numbers only.
				 */

				
				int[][] numbers = {
						{2,3,4,5,6},
						{7, 8}, 
						{10, 11, 15}
				};
				
				//indexed for loop
				for (int row = 0; row < numbers.length; row++)
				{
					for (int col = 0; col < numbers[row].length;col++)
					{
						if (numbers[row][col] % 2 == 0)
						{
							System.out.print(numbers[row][col] + " ");
						}
					}
				System.out.println();
				}
				
				System.out.println("--------------------");

				//for each
				
				for (int[] row : numbers)
				{
					for (int col : row)
					{
						if (col % 2 == 0)
						{
							System.out.print(col + " ");
						}
					}
					System.out.println();
				}
				
				
				
			}

		

	}


