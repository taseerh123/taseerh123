package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed = "Golden Retriever";
		dog1.size = "Medium";
		dog1.color = "Brown";
		dog1.age = 2;
		
		Dog dog2 = new Dog();
		dog2.breed = "German Shepherd";
		dog2.size = "Large";
		dog2.color = "Black";
		dog2.age = 1;
		
		Dog dog3 = new Dog();
		dog3.breed = "Greyhound";
		dog3.size = "";
		dog3.color = "Grey";
		dog3.age = 3;
		
		
		dog3.eat();
		dog3.breed();
		dog3.run();
	}

}
