package com.neotech.lesson23;

public class ParentTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		//p.hello(); //private, cannot access from here
		Parent.bye();
		
		System.out.println("----------------");
		
		Child c = new Child();
//		c.hello(); //private, cannot access from here
		Child.bye();
		
		
		
	
	}

}
