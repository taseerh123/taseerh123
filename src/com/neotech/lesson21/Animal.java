package com.neotech.lesson21;

public class Animal {
	
	//some attributes
		String name, color;
		int age, weight;
		
		//lets create some behaviors
		public void eat()
		{
			System.out.println("All animals eat!");
		}
		
		public void sleep()
		{
			System.out.println("All animals sleep!");
		}
		
		
		public void displayInfo()
		{
			System.out.println("Name: " + name + "\nColor: " + color 
					+"\nAge: " + age + "\nWeight:" +weight);
		} 
}
