package com.neotech.lesson18;

import java.util.Arrays;

public class Homework1 {

	public static void main(String[] args) {
		
		
		String str = "Sunday";
		
		for (int i = str.length() - 1; i >=0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
			
		}
		System.out.println();
		//2nd way: use toCharArray() this methods breaks string into a char array
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		for(int i = arr.length - 1; i>=0; i--) {
			char c = arr[i];
			System.out.print(c);
		}
		System.out.println();
		
		StringBuffer strBuffer = new StringBuffer(str);
		System.out.println(strBuffer.reverse());
		
		System.out.println("-------");
		System.out.println(str);
		
		StringBuilder strBuilder = new StringBuilder(str);// faster
		System.out.println(strBuilder.reverse());
	}
		

}
