package com.neotech.lesson23;






public class UserClassTest {

	public static void main(String[] args) {

		
		UserClass uc = new UserClass();
		System.out.println(uc.name + " " + uc.mobileNumber);
		
		
		
		UserInfo ui = new UserInfo("Paul", 3453463543L, "123 Prospect");
		ui.userDetails();
		
	}

}