package com.neotech.review08_Abstraction;

public class Turkish extends Human{
	
	public Turkish(String name) {
		super(name);
	}

	public void talk() {
		System.out.println(name + " says Merhaba");
	}

	public void makeBaklava() {
		System.out.println("I am making baklava.");
	}

}
