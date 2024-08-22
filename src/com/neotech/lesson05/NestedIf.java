package com.neotech.lesson05;

public class NestedIf {

	public static void main(String[] args) {
		// if it is morning ---> good morning
		//if it is a school day ---> you are at home
		//else      > you are at home
		// else    --> good afternoon
		boolean isMorning = true;
		boolean isSchoolDay = true;
		boolean isThursday = false;
		
		if (isMorning)
		{
			System.out.println("Good Morning");
			
			if (isSchoolDay)
			{
				System.out.println("You are at school!");
			}			
			else
			{

			System.out.println("You are at home! ");
				
			}
		}
		else //not morning
		{
			System.out.println("Good Afternoon");
			
			if (isThursday)
			{
				System.out.println("You are at Movies");
			} else
			{
				System.out.println("You are sleeping");
			}
		}
	}

}
