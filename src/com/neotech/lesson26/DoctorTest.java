package com.neotech.lesson26;

public class DoctorTest {

	public static void main(String[] args) {
   Dotor doc = new Dotor();
		
		doc.setEmail("doctor@gmail.com");
		doc.setLicenseID(34654654);
		doc.setPhoneNumber(54654756);
		
		
		System.out.println(doc.getEmail());
		System.out.println(doc.getLicenseID());
		System.out.println(doc.getPhoneNumber());
		
	}

}
