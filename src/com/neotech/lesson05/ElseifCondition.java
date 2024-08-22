package com.neotech.lesson05;

public class ElseifCondition {

	public static void main(String[] args) {
		
		double d1 = 35.5;
			double d2 =37.5;
			
			//d1 might be larger than d2
			//d2 might be larger than d1
			//d1 and d2 might be equal
			
			if (d1 > d2)
			{
				System.out.println("Number " + d1 + " is larger than " +d2 );
			}
			// I can list all the situations I want to identify
			//then at the end i can call which would cover any other possible situation I have not considered
			else if (d1 < d2)
			{
				System.out.println("Number " + d2 + " is larger than " + d1);
			}
			
			else
			{
				System.out.println("Number " + d2 + " is equal " + d1);
			}
		

	}

}
