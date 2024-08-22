package com.neotech.lesson27;

public class RegistrationTest {
	
	public static void main(String[] args) {

		Registration r = new Registration();
		//r.email = "myEmail@yahoo.com";
		
		System.out.println("----Email----");
		r.setEmail("myEmail@yahoo.com");
		System.out.println(r.getEmail());
		
		
		r.setEmail("myEmail@neotech.com");
		System.out.println(r.getEmail());
		
		
		
		System.out.println("----Username----");
		r.setUserName("Abeera");
		System.out.println(r.getUserName());
		
		r.setUserName("Sabah");
		System.out.println(r.getUserName());
		
		
		System.out.println("----Password----");
		r.setPassword("abeera123");
		System.out.println(r.getPassword());
		
		r.setPassword("Abeera123");
		System.out.println(r.getPassword());
		
		
		
		
	}

}
