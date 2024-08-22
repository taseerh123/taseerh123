package com.neotech.lesson26;

public class MarkTest {
	
	public static void main(String[] args) {

		StudentA st1 = new StudentA(85, 75, 67.5);
		System.out.println(st1.getAverage());
		
		StudentB st2 = new StudentB(75, 84, 95.5, 87);
		System.out.println(st2.getAverage());
	
		//runtime polymorphism
		Marks st3 = new StudentA(75.5, 85.6, 90);
		System.out.println(st3.getAverage());
	
	}

}
