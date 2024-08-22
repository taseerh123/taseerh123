package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		//we set the size, it is fixed, cannot change
		
		//The syntax is: 
		//ArrayList<ObjectType> variableName  = new ArrayList<>();
		
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names);
		
		System.out.println("the size is: " + names.size());
		
		names.add("Emrah");
		names.add("Nargiza");
		names.add("Abeera");
		names.add(0, "Uygar");
		
		System.out.println(names);
		System.out.println("the size is: " + names.size());
		
		
		System.out.println("Iterate using for loop");
		
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		
		System.out.println("Iterator using for each");
		
		for (String name : names)
		{
			System.out.println(name);
		}
		

	}

}
