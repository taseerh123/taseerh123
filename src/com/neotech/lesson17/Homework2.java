package com.neotech.lesson17;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the fathers name: ");;
		String fname = scan.next();
		
		System.out.println("Enter the mothers name: ");;
		String mname = scan.next();
		
		System.out.println("Are you expcting a boy or a girl?");
		String baby = scan.next();
		
		
		
		if (baby.equalsIgnoreCase("boy")) {
			String firstHalf = fname.substring(0,fname.length()/2);
			String secondHalf = mname.substring(mname.length()/2);
			
			String babyName = firstHalf + secondHalf;
			
			System.out.println(fname.substring(0, fname.length()/2).concat(mname.substring(mname.length()/2)));
		}else if (baby.toLowerCase().equals("girl")){
			String babyName = mname.substring(0, mname.length()/2) + fname.substring(fname.length()/2);
			System.out.println(babyName.toUpperCase());
			
		}else {
			System.out.println("Wrong entry");
		}
		

	}

}
