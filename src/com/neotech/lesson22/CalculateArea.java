package com.neotech.lesson22;

public class CalculateArea {
	
	/*	
	Create a class named CalculateArea in which you should create three methods (with the same name )
	that will calculate the area (volume) of  
	* Rectangle
	* Square 
	* Box

	For Rectangle give 2 sides
	For Square give 1 side
	For Box give 3 sides

	Use a separate class to test your code
	
	*/
	
	/**
	 * This method returns the area of a rectangle given two sides.
	 * 
	 * @param side1
	 * @param side2
	 */
	static void area(int side1, int side2) 
	{
		System.out.println("The area of the rectangle is: " + side1*side2);
	}
	
	/**
	 * This method returns the area of a square given its side.
	 * @param side
	 */
	static void area(int side)
	{
		System.out.println("The area of the square is: " + side * side);
	}
	
	
	/**
	 * This method returns the area of the box given its three sides
	 * 
	 * @param l  - for length
	 * @param w  - for width
	 * @param h  - for height
	 */
	static void area(int l, int w, int h)
	{
		System.out.println("The area of the box is: " + l*w*h);
	} 
	
	
	public static void main(String[] args) {
		
		area(5);
		area(4,8);
		area(4,5,6);
	}
	

}
