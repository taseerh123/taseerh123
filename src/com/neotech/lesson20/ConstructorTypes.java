package com.neotech.lesson20;

public class ConstructorTypes {
	
	String name;
	int age;
	//default constructor
	//no return type
	//must have same name as class
	//parameter
	ConstructorTypes(){
		System.out.println("I am the default construtor!");
	}
	
	// we may have several constructor method
	ConstructorTypes(String str){
		System.out.println("I am a constructor with a string: " + str);
	}
	
	ConstructorTypes(int num){
		System.out.println("I am a constructor with an integer: " + num);
	}
	
	ConstructorTypes(double dbl){
		System.out.println("I am a constructor with an double: " + dbl);
	}
	
	ConstructorTypes(String str, int num){
		System.out.println("I am a constructor with a string and an integer: " + str + " " + num);
		name = str;
		age = num;
	}
	
	ConstructorTypes(String str, String str1){
		System.out.println("I am a constructor with two string: " + str + " " + str1);
	}
	
	
	

	public static void main(String[] args) {
		//using the constructor //used for creating objects
		ConstructorTypes ct1 = new ConstructorTypes();
		ct1.name = "Abeera";
		ct1.age = 26;
		
		ConstructorTypes ct2 = new ConstructorTypes("Khenrab");
		System.out.println(ct2.name);
		
		ConstructorTypes ct3 = new ConstructorTypes("Tima", 26);
		ct3.name = "Nazli";
		System.out.println(ct3.name);
		System.out.println(ct3.age);
		//wont work there is no such constructor
		//ConstructorTypes ct4 = new ConstructorTypes("Paul", "Jennifer","Tima");

	}

}
