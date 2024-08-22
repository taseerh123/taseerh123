package com.neotech.lesson30;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {


		HashMap<Integer, String> map =  new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Apple");
		map.put(3, "Neotech");
		map.put(4, "Amazon");
		map.put(5, "Ztsystems");
		
		System.out.println("Map: " + map);
		System.out.println("The size of the map is: " + map.size());
		
		map.put(4, "Blackrock");
		
		
		
		 map.remove(3);
		 System.out.println("Map: " + map);
	}

}
