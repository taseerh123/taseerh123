package com.neotech.lesson23;

public class ShapeTest {

	public static void main(String[] args) {

		Shape s = new Shape(5);
		//s.calculateArea(); //parents do not inherit from children
		
	//	Circle c = new Circle();
		//Why can't I do this??
		//the creator of the class is not allowing a default constructor
		
		//	c.calculateArea();
		
		
		
		Circle c2 = new Circle(4);
		c2.calculateArea();

	}

}
