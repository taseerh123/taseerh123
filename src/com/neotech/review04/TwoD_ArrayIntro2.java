package com.neotech.review04;

import java.util.Arrays;

public class TwoD_ArrayIntro2 {

	public static void main(String[] args) {
		int[] num = {3,7,2};
		
		int [][] nums = { {5, 2, 3},
						{9, -1, 6}, 
						{2, 0, 7},
						{8, 3, 4} 
						};
		System.out.println(nums[1][2]);
		System.out.println(nums[3][0]);
		System.out.println(nums[0][2]);
		System.out.println(nums[3][1]);
		
		System.out.println("-------");
		for (int[] row: nums) {
			for (int element : row) {
				System.out.println(element + " ");
			}
			System.out.println();
		}
		//how to get the row with index2
		int[] row2 = nums[2];
		System.out.println(Arrays.toString(row2));
		
		System.out.println("--------------");
		for (int[] row : nums)
		for (int i = 0; i < row.length; i++) {
			System.out.print(row[1] + " ");
		}
		System.out.println();
	}

}
