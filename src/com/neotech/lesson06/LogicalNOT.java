package com.neotech.lesson06;

public class LogicalNOT {

	public static void main(String[] args) {
		
		//! (NOT0  -> it will reverse the value of the boolean
		//!= -> not equal
		boolean b1 = !true;
		System.out.println(b1);
		
		boolean b2 = !false;
		System.out.println(b2);
		//neate an expression that produces a boolean
		System.out.println(!(6 < 4));
		
		boolean isCold = !true;
		if (!isCold) {
			System.out.println("its hot!");
		}
		
		int x = 13;
		if (x == 12) {
			System.out.println("x is 12");
		}else {
			System.out.println("x is not 12");
		}
		if (x !=12) {
			System.out.println("x is not 12");
		}
		System.out.println(!(x == 12)); // !  -->  negate the bollean 
	} 

}
