package com.neotech.lesson30;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework3 {

	public static void main(String[] args) {
		// Create a Set collection that will hold Objects of Student Type. 
		//In this set we do not care about the insertion order. 
		//Each student object should have name and studentID. 
		//Display name of each student.

		
		Student s1 = new Student("Sufiyan", 1);
		//the parameters are private, I can only deal with the provided setters and getters
		
		
		Set<Student> students = new HashSet<>();
		students.add(s1);
		students.add(new Student("Emrah", 2));
		students.add(new Student("Mahwish", 3));
		students.add(new Student("Paul", 4));
		
		Iterator<Student> it = students.iterator();
		
		//loop through the set and call the getName()
		while(it.hasNext())
		{
			Student currentStudent = it.next();
			
			System.out.println(currentStudent.getStudentID()  + " : "+ currentStudent.getName());
		}
	
		System.out.println("-----------");
		
		//using for each
		for (Student st : students)
		{
			System.out.println(st.getStudentID() + " : " + st.getName());
		}
	}

}

class Student
{
	private String name;
	private int studentID;
	
	//parametrized constructor -- I want every student created to have a name and an id
	//the constructor will set the values
	//the variables will be initialized on object creation
	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	
	
	//getters: no arguments, return something (datatype depends on what we return)
	public String getName() {
		return name;
	}


	public int getStudentID() {
		return studentID;
	}
	
	
	//setters: has arguments, no return type
	public void setName(String name)
	{
		this.name = name;
	}
	
}