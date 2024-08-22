package com.neotech.lesson12;
import java.util.Arrays;
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] numbers = new int[2][4];
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println();
		
		numbers[1][0] = 30;
		numbers[1][1] = 35; 
		numbers[1][2] = 40; 
		numbers[1][3] = 45; 
		//System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		numbers[1][0] = 10;
		numbers[1][1] = 15;
		numbers[1][2] = 20;
		numbers[1][3] = 25;
		System.out.println(Arrays.toString(numbers[1]));
		//System.out.println(Arrays.toString(numbers[0]));

	}

}
