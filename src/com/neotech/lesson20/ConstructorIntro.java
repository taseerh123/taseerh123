package com.neotech.lesson20;

public class ConstructorIntro {
	
	
	String name;
	int age;
	
	//decclaring constructor
	//name of constructor has to be same with the class
	ConstructorIntro(){
		System.out.println("i am the default constructor!");
	}

	public static void main(String[] args) {
		
		ConstructorIntro con = new ConstructorIntro();
		
		ConstructorIntro con2 = new ConstructorIntro();
		
		con.name = " Preethi";
		con.age = 25;
		
		System.out.println(con.name + " " + con.age);

	}

}
