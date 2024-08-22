package com.neotech.lesson23;

public class Homework2 {
	
	static void info() {
		System.out.println("Today is Tuesday!");
	}
	
	static void info(String day) {
		System.out.println("Today is " + day);
	}
	

	static void info(String day, String month) {
		System.out.println("Today is " + day + "the month is " + month);
	}
	
	static void info(String[] strArray) {
		System.out.println("Today is " + strArray[0] + " and the month is "+ strArray[1]);
	}
	
	
	public static void main(String[] args) {
		info();
		info("Tuesday");
		info("Tuesday", "June");
		String[] strArr = {"Tuesday", "June"};
		info(strArr);
		
	}

}
