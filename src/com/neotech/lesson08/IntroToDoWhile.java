package com.neotech.lesson08;

public class IntroToDoWhile {

	public static void main(String[] args) {
		
		//for while loop:
		//if the condition is false, do not execute the body, just move on
		// if the condition is true, keep executing the body, untill the condition bcomes false
		int num = 10;
		
		while (num < 15) 
		{
			System.out.println( num + " ");
			num++;
			
		}
		
		System.out.println();
		//Do while Loop:
		//first execute the body once, then check the condition,
		//if the condition is false, do not execute the body anymore, just move on
		//if the condition is true, go back to executing the body untill it becomes false
		 num = 1;
		do {
		System.out.println(num + " ");
		
		num++;
		
		}while (num < 10);
	}

}
