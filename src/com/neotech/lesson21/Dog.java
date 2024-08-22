package com.neotech.lesson21;



	public class Dog extends Animal{ 
		//by using extend, we get all attributes and behaviors
		//of the Animal class
		
		
		
		//dog specific property
		String breed;
		
		
		//dog specific behavior
		public void bark()
		{
			System.out.println("Only dog barks");
			System.out.println("The breed is: " + breed);
			System.out.println("The name is " + name);
		}
		

}
