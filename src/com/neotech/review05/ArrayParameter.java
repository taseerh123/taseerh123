package com.neotech.review05;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {
		int[] array = {8, 6, 4, 2, 0};
		System.out.println(array[1]);
		
		 String str = Arrays.toString(array);
		 System.out.println(str);
		 
		 ArrayParameter ap = new ArrayParameter();
		 int result = ap.largestNumber(array);
	}
	
	public int largestNumber(int[] arr) {
		int largest = arr[0];
		
		for (int el : arr) {
			if (el > largest) {
				largest = el;
			}
		}
		
		return largest;
	}

}
