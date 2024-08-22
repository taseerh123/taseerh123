package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10); //auto-boxing
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		//Integer num = 5;  //auto-boxing

		System.out.println("Element at index 2 is: " + numbers.get(2));
		
		System.out.println("Does numbers contain 30? " + numbers.contains(30));
		
		System.out.println("Does numbers contain 50? " + numbers.contains(50));
		
		System.out.println(numbers);
		
		
		numbers.remove(0);//remove element at index 0
		System.out.println(numbers);
		
		numbers.remove(new Integer(40));//remove the element 40
		System.out.println(numbers);
		
		//if we have the object we can remove it directly
		numbers.add(50);
		System.out.println(numbers);
		
		Integer el = 50;
		
		numbers.remove(el);
		System.out.println(numbers);
		
		
		numbers.clear();
		System.out.println(numbers);
		

	}

}
