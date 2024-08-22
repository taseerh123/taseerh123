package com.neotech.lesson19;

public class Task1 {
	
	
	
	
	int sum(int[] arr) {
		int sum = 0;
		for (int el: arr)
		{
			sum += el;
		}
		return sum;
	}	
public static void main(String[] args) {
	Task1 obj = new Task1();
	
	int [] array = {25, 55, 12, 47, 95};
	int sum = obj.sum(array);
	
	System.out.println("The sum of the array is: " + sum);
}
}
