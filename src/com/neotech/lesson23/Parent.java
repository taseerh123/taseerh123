package com.neotech.lesson23;

public class Parent {
	
	Parent()
	{
		System.out.println("Parent Class Constructor");
	}
	
	
	private void hello()
	{
		System.out.println("Hello from the parent class!");
	}
	
	static void bye()
	{
		System.out.println("Bye from the parent class!");
	}
	
	
}


class Child extends Parent
{
	Child()
	{
		System.out.println("Child Class Constructor");
	}
	
	
	
	//we are not overriding, because we do not actually have access to the private method of the superclass
	//we are just creating another method
	private void hello()
	{
		System.out.println("Hello from the child class!");
	}
	
	//we are just re-declaring a static method in this class, but not overriding the method from the parent class
	static void bye()
	{
		System.out.println("Bye from the child class!");
	}
	

}
