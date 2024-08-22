package com.neotech.lesson18;

public class Dog {
	
	String name;
	int age;
	
	static String breed = "Husky";
	static int paws = 4;
	void displayDogInfo() {
		System.out.println("name:" + name + " age:" + age + " breed:" + breed + " paws:" + paws);
	}

}
