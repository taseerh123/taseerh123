package com.neotech.lesson22;

public class ParentChildTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.display();
		c.sayHello();
		
		
		//which method is this calling
		c.hello();

	}

}
