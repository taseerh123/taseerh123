package com.neotech.lesson15;

public class PhoneStore {

	public static void main(String[] args) {
		Phone iPhone = new 	Phone();
		iPhone.brand = "Iphone";
		iPhone.color = "Blue";
		iPhone.model = "15 pro max";
		iPhone.price = 1000;
		
		iPhone.call();
		iPhone.text();
		iPhone.navigate();
		
		System.out.println();
		
		Phone samsung = new Phone();
		samsung.brand = "Samsung";
		samsung.color = "White";
		samsung.model = "s24 ultra";
		samsung.price = 900;
		
		samsung.call();
		samsung.text();
		samsung.navigate();
		
		System.out.println();
		Phone nokia = new Phone();
		nokia.brand = "Nokia";
		nokia.color = "Gray";
		nokia.model = "8210";
		nokia.price = 200;
		
		nokia.call();
		nokia.text();
		nokia.navigate();
		
		

	}

}
