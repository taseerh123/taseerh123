package com.neotech.lesson12;

public class TwoDimensionalArrayLength {

	public static void main(String[] args) {
		String[][] months = {
				{"December", "January", "February", "Unknown"},
				{"March", "April", "May"},
				{"June", "July", "August"},
				{"September", "October","November"}
		};
		
		int rows = months.length;
		System.out.println("rows -> " + rows);
		int lengthOfFirstRow = months[0].length;
		System.out.println("The first row has " + lengthOfFirstRow + " columns");
		System.out.println(months[0][3]);
		}

}
