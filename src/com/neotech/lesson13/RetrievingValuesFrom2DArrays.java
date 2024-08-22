package com.neotech.lesson13;

public class RetrievingValuesFrom2DArrays {

	public static void main(String[] args) {
		String[][] months = {
				{"December", "January", "February"},
				{"March", "April", "May"},
				{"June", "July", "August"},
				{"September", "October", "November"}
		};
		int rows = months.length;
		System.out.println(rows);
		
		int cols = months[0].length;
		System.out.println(cols);
		for(int row = 0; row < rows; row++)
		{
			for(int col = 0; col < cols; col++)
			{
				//System.out.println("["+row+"]["+col+"]" );
				System.out.println(months[row][col]);
			}
			System.out.println();
		}
		System.out.println("-------");
		int[][] numbers = {
				{1,3,4,6},
				{4,6,7,17,8,9,3},
				{10},
				{11, 12}
		};
		for (int row = 0; row < numbers.length; row++)
		{
			for(int col = 0; col < numbers[row].length;col++)
			{
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}
	}

}
