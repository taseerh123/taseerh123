package com.neotech.review05;

public class FamilyDemo {

	public static void main(String[] args) {
		// i can acess satic /class variable before i create an object
		FamilyMember.lastName = "Messi";
		//I CANNOT access instance variables before I create an object
		//FamilyMember.firstName = "Lionel";
		// I can acess static/class methods before I create an object
		FamilyMember.printFamilyName();
		
		
		System.out.println("--------------------");
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "Lionel";
		member1.age = 37;
		
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Antonela";
		member2.age = 35;
		member1.printFullName();
		member2.printFullName();
		
		System.out.println("---------------------");
		
		System.out.println("They went to court  to change their last name!!!!!");
		FamilyMember.lastName = "GOAT";
		member1.firstName = "Leo";
		
		member1.printFullName();
		member2.printFullName();
		
		

	}

}
