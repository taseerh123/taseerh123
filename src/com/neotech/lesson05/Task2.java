package com.neotech.lesson05;

public class Task2 {

	public static void main(String[] args) {
		// if it is Friday  ---> I will watch a movie
		//if the date is 13 ---> I will watch a scary movie
	// else (dat != 13 ----> I will watch a comedy movie
		// else (notFriday) ----> It is NOt Friday, so I will study Java

		boolean isFriday = true;
		int date =10;
		if (isFriday) 
		{
			System.out.println("It's Friday, I will watch a movie!");
			
			if (date == 13)
			{
				System.out.println("I will watch a scary movie!");
			} else {
				System.out.println("I will watch a comedy movie!");
			}
			
		}else {
			System.out.println("It's not Friday, I will study Java!");
		}
	}

}
