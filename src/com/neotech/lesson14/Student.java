package com.neotech.lesson14;

public class Student {
// features: studentID, name, 1Nam, age, school grade
	//behaviours: study(), doHomework()
	
	int StudentID, age;
	String name, lastName, school;
	char grade;
	
	void study()
	{
		System.out.println(name + " " + lastName + " is studying!");
	}
	void doHomework()
	{
		System.out.println(name + " is doing the homework!");
	}
	void grade()
	{
		System.out.println(name + " has grade " + grade);
	}
}
