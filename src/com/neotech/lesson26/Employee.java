package com.neotech.lesson26;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	
	//we put the variables as private 
	// - I can only access them from within the class
	
	
	//there can be two situations: 
	//1 - someone needs to get the value of a parameter
			// - we will create getter
	//2 - someone needs to set the value of a parameter
			// - we will create setter
	
	//for every variable I can define a getter and a setter 
		//but it is NOT required
	
	//getter for name
	public String getName()
	{
		return name;
	}
	
	
	//getter for age
	public int getAge()
	{
		return age;
	}
	
	
	//getter for salary
	public double getSalary()
	{
		return salary;
	}
	
	
	//setter for name
	/**
	 * If you want to be able to set the name, 
	 * you have to send a string that is not empty
	 * and is at least 2 characters.
	 * @param name
	 */
	public void setName(String name)
	{
		//I want to allow this only if the string sent
		//is not empty and is at least 2 characters
		if (!name.isEmpty() && name.length() >= 2)
		{
			this.name = name; 
		}
	}
	
	
	
	//setter for age
	public void setAge(int age)
	{
		this.age = age;
	}
	
	//setter for salary
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

}
