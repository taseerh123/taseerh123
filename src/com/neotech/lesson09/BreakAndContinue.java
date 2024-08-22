package com.neotech.lesson09;

public class BreakAndContinue {

	public static void main(String[] args) {
		System.out.println("Print numbers from 1 to 10 until 5 is hit");
		for (int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.print(i + " ");
		}
		//next statement
		System.out.println();
		System.out.println("Print numbers from 1 to 10 but skip 5");
		for (int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
