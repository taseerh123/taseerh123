package com.neotech.lesson21;

public class Student {
	
	String name, address;
	
	
	//constructor is a special method named same as class
	//it doesn't have a return type.
	Student()
	{
		
	}
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	
	public void displayInfo()
	{
	System.out.println("Name: " + this.name + " \nAddress: " + this.address);	
	}
	
}
