package com.neotech.lesson10;

public class Homework3 {

	public static void main(String[] args) {
		//print numbers from1 to 50 except those divisiblle by 3
		// for any loop we need
		// starting point
		// ending point
		//increment
		
		// using while loop
//		
//		int num = 1;
//		while (num <= 50)
//		{
//			if (num % 3 == 0) 
//				num++;
//			System.out.print(num + " ");
//			}
		
			//do while
//		int i = 1;
//		do {
//			if(i % 3 ==0) 
//			{
//				i++;
//				continue;
//			}
//			System.out.println(i + " ");
//		}
//		while (i <= 50);
		
		System.out.println("-------");
			
			for(int j = 1; j <=50; j++)
			{
				if(j % 3 == 0)
				{
					continue;
				}
				System.out.print(j + " ");
			}
		}

	}

