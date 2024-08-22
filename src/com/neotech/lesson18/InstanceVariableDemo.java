package com.neotech.lesson18;

public class InstanceVariableDemo {

	public static void main(String[] args) {
		InstanceVariables iv1 = new InstanceVariables();
		System.out.println(iv1.name);
		
		InstanceVariables iv2 = new InstanceVariables();
		iv2.name = "Jennifer";
		System.out.println(iv2.name);
		
		InstanceVariables iv3 = new InstanceVariables();
		System.out.println(iv3.name);
		iv3.name = "Emin";
		System.out.println(iv3.name);
	}

}
