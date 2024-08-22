package com.neotech.lesson15;

public class TestCalcWithreturn {

	public static void main(String[] args) {
		CalculatorWithReturn cal = new CalculatorWithReturn();
		
		int result = cal.add(10, 5);
		System.out.println(result);
		//or
		System.out.println(cal.add(10, 5));
		
		//multiplication
		System.out.println(cal.multiply(28, 55));
		//division
		System.out.println(cal.divide(15.4, 2.7));
		//or
		double result1 = cal.divide(15.4, 2.7);
		System.out.println(result1);
		
		System.out.println("give me something " + cal.giveMeSomething());
		cal.dontGiveMeAnything();
		
		System.out.println("avg of 5, 7 and 3 is " + cal.average(5,  7,  3));
		
		//multiply 2 with the avg of 5, 7 and 3
		System.out.println(cal.multiply(2, (int)cal.average(5, 7, 3)));

	}

}
