package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "Paul";
		st1.address = "LA";
		
		System.out.println("---------------");
		
		Student st2 = new Student("Abeera");
		st2.displayInfo();
		st2.address = "CT";
		st2.displayInfo();
		
		Student st3 = new Student("Umut", "NY");
		st3.displayInfo();
	}

}
