package com.neotech.review03;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {
		int [][] numbers = new int[3][4];
		numbers[1][2] = 7;
		numbers[2][0] = 9;
		numbers[0][0] = 4;
		numbers[0][0] = 5;
		int rows = numbers.length;
		System.out.println("The number of rows ->" + rows);
		int cols1 = numbers[1].length;
		System.out.println("The length of the row index 1 is -> " + cols1);
		System.out.println("-------------");
		
		
		int[] [] numbers2 = {
				{7, 8, 2},
				{9, 1, 6},
				{3, 1, 7},
				{2, 5, 8}
		};

	}

}
