package com.neotech.review02;

public class WhikeDemo {

	public static void main(String[] args) {
		String greetings = "Miremengjes";
		
		
		int number = 1;
		while (number <= 5) {
			System.out.println(number + " - " + greetings);
			number++;
		}
		System.out.println("----------");
		
		int count = 5;
		while (count > 0) {
			System.out.println("Happy Mother's Day!");
			count--;
		}
		System.out.println("----------");
		
		int i = 0;
		while (true) {
			if(i ==2) {
				break;
			}
			System.out.println(greetings);
			i++;
		}
	}

}
