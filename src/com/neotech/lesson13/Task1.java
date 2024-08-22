package com.neotech.lesson13;

public class Task1 {

	public static void main(String[] args) {
	

				/*
				 * Create a 2D array of integer type with 3 rows and 4 columns and print all
				 * values of the whole array.
				 */
				
				
				int[][] numbers = {
						{2,3,4,5,6},
						{7, 8}, 
						{10, 11, 15}
				};
				
				//some additional questions
				//NOT OUR TASK: Do I need a nested for loop structure to print the first row?
				for (int el = 0; el < numbers[0].length; el++)
				{
					System.out.print(numbers[0][el] + " ");
				}
				System.out.println();
				
				//Do I need a nested for to print just the first column?
				
				//our 2D array: numbers
				for (int row = 0; row < numbers.length; row++)
				{
					for (int col = 0; col < numbers[row].length; col++)
					{
						System.out.print(numbers[row][col] + " ");
					}
					System.out.println();
				}
				
				//for each loop
				//numbers is a 2D array
		/*		{
		  			{		},
		  			{		},
		  			{		},
					{		},
				}
				
		*/		System.out.println("-----------------------");
				for (int[] row : numbers)//row is just a name I used
				{
					for (int el : row) //el is just an identifier
					{
						System.out.print(el + " ");
					}
					System.out.println();
				}
				
				
			}

		

	}


