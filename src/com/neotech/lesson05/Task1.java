package com.neotech.lesson05;

public class Task1 {

	public static void main(String[] args) {
	 int day = 2;
	 
	 if(day == 1)
	 {
		 System.out.println("Today is Monday and we are working! ");
	 }
	 else if (day == 2)
	 {
		 System.out.println("Today is Tuesday and we are working! ");
	 }
	 else if (day == 3)
	 {
		 System.out.println("Today is Wednesday and we are working! ");
	 }
	 else if (day == 4)
	 {
		 System.out.println("Today is Thursday and we are working! ");
	 }
	 else if (day == 5)
	 {
		 System.out.println("Today is Fridayy and we are working");
	 }
	 else 
	 {
		 System.out.println("We are on  break on the weekend");
	 }
	 // modify 
	 if (day < 6)
	 {
		 System.out.println("Today is a weekday and we are working");
	 }
	 else if (day < 8)
	 {
		 System.out.println("Today is a weekend ands we are on break! ");
	 }
	}

}
