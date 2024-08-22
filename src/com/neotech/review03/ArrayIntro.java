package com.neotech.review03;

public class ArrayIntro {

	public static void main(String[] args) {
		int[] grades = new int[4];
        grades[2] = 85;
        grades[0] = 95;
        grades[3] = 100;
        grades[1] = 90;
        int size = grades.length;
        
        int total = 0;
        for (int i = 0; i < 4; i++) {
        	total  += grades[i];
        }
        System.out.println("The total of the array is -> " + total);
        int [] numbers = {10, 20,  15, 25};
        int total2 = 0;
        for (int num : numbers) {
        	total2 += num;
        }
        System.out.println("The total of the array is -> " + total2);
	}

}
