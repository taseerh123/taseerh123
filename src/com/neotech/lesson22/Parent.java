package com.neotech.lesson22;

public class Parent {
	
	String name = "Parent Name";
	String lastName = "Parent LastName";
	
	void hello()
	{
		System.out.println("I am the parent class!");
	}
	
}


class Child extends Parent 
{
	
	String name = "Child Name";
	
	
	void hello()
	{
		System.out.println("I am the child class!");
	}
	
	
	void display()
	{
		System.out.println(name);//which name is printed here? //child name - Java automatically adds this. in front of it
		System.out.println(this.name);
		System.out.println(super.name); //super refers to the parent class
		System.out.println(lastName); //which lastName is printed here? //PARENT
		System.out.println(super.lastName); //
		System.out.println(this.lastName);
	}
	
	
	void sayHello()
	{
		display(); //Java automatically adds this. in front of it
		hello(); //Java automatically adds this. in front of it
		super.hello(); //by adding super we are specifying that we want the method in the super/parent class 
	}

}
