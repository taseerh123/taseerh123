package com.neotech.lesson25;

public class PhoneTest {

	public static void main(String[] args) {
		// we can not instantiate the Phone class since it is abstract (not finished,
				// not fully implemented)
				// Phone ph1 = new Phone();

				Phone iphone = new iPhone(); // upcasting
				iphone.call(); // overriding - child method will run
				iphone.text(); // inherited method - parent method will run
				iphone.takePicture(); // implemented method - child method will run
				iphone.playMusic(); // implemented method

				Phone samsung = new Samsung(); // upcasting
				samsung.call();
				samsung.text();
				samsung.takePicture();
				samsung.playMusic();
				// samsung.googlePlay(); - does not exist in Phone class


	}

}
