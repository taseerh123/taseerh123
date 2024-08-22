package com.neotech.lesson18;

public class DogDemo {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		
		dog1.name = "Mars";
		dog1.age = 1;
		dog1.displayDogInfo();
		
		Dog dog2 = new Dog();
		dog2.name = "Kofte";
		dog2.age = 2;
		dog2.displayDogInfo();
		dog2.breed = "Golden";
	}

}
