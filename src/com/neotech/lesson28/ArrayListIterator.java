package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		

		ArrayList<String> choco = new ArrayList<>();

		choco.add("Hershey");
		choco.add("Kinder");
		choco.add("Godiva");
		choco.add("Ulker");

		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("Baklava");
		sweets.add("Treleche");
		sweets.add("Milkcake");

		// add all choco items in sweets list
		sweets.addAll(choco);
		System.out.println("sweets has " + sweets.size() + " items!");

		// how to we iterate collections:
		// 1. way: we can use loops (indexed or enhanced for loop) or any loop you like

		// 2. way; Using an Iterator object
		Iterator<String> it = sweets.iterator();

		// it.hasNext() --> checks if there is a next element in list
		while (it.hasNext()) {
			String element = it.next();

			System.out.print(element + " - ");
			if (element.equals("Kinder")) {
				it.remove();
			}
		}
		System.out.println();
		System.out.println(sweets);
		
		// enhanced for loop
		for(String sweet: sweets) {
			System.out.print(sweet + " - ");
		}
		
		System.out.println();
		
		
		//using the indexed for loop
		for (int i = 0; i < sweets.size(); i++) {
			System.out.print(sweets.get(i) + " - ");
		}


	}

}
