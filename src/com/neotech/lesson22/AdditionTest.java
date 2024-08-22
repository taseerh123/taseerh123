package com.neotech.lesson22;

public class AdditionTest {

	public static void main(String[] args) {
		
Addition obj = new Addition();
		
		obj.add(5, 15);
		obj.add(4, 5, 7);
		
		obj.add(5.2, 12.5);
		obj.add(3.5, 2.5, 5.5);
		
		
		obj.add(5.0, 4);
		obj.add(5, 4.2);
		
			//String, int
		obj.add("Fasry", 10);
		obj.add(10, "Fasry");

	}

}
