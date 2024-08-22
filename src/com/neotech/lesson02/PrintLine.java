package com.neotech.lesson02;

public class PrintLine {

	public static void main(String[] args) {
		System.out.println("What up everyone");
		
	/*println --> prints the statement and moves the cursor to net line
	 * print --> this statement keeps the cursor in line
	 */
		System.out.print("1"); // after printing 1, cursor stays in the same line
		System.out.print("2"); // this is printed where the cursor is
		System.out.print("3"); // this is also printed where the cursor is 
		System.out.println("4");// this will print to 3 and cursor will go to next line
		System.out.println("5"); // this will print 5 and cursor will go to next line
		System.out.println("6");
		
		System.out.println("Do you like java?\nYes, I do");// \n --> will create next line in if you are print once and you want to break a sentence into two
		System.out.print("\n"); // this will move the cursor to next line
		System.out.println("\n");// this will move the cursor two next line
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n\n\n");
		System.out.println("Something else");
		/*comment line 1
		comment line 1   CTRL + /   single line comment
		comment line 1 CNTRL+ shift / & CTRL + \ () (Multiple line comment
		comment line 1*/
	

}
	
}
