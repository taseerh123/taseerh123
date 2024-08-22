package com.neotech.lesson03;

public class HomeWork {

	public static void main(String[] args) {
		// Very useful Formula
		//declaring a variable      |   assigning a value (initialize)
		// data type    identifier(name) assignment operator (=) value ;
		
		double scale = 1.609344;
		double km;// declaring one variable
		double km2, mile, mile2; //declaring multiple variables of the same type
		mile = 2;
		km = mile * scale;
		System.out.println(mile + " miles is " + km + " kilometers.");
		
		System.out.println("===================");
		
		km2 = 60;
		mile2 = km2/scale;
		
		System.out.println(km2 + " kilometers is " + mile2 + "miles.");
		
	}

}
