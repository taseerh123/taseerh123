package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("Preethi");
		list1.add("Iana");
		list1.add("Uygar");
		list1.add(1, "Tima"); // ["Preethi","Tima","Iana","Uygar"]
		list1.add(0, "Elma");

		System.out.println(list1);
		System.out.println("The size of list1 is " + list1.size());

		LinkedList<String> list2 = new LinkedList<>();
		list2.add("Nida");
		list2.add("Paul");
		list2.add(0, "Emrah");

		list2.addFirst("Nazli");
		list2.addLast("Ebru");

		System.out.println(list2);
		System.out.println("the size of list 2 is " + list2.size());

		// lets iterate over the items of the linked list
		for (String item : list2) {
			System.out.print(item + " - ");
		}

		System.out.println();

		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " - ");
		}

		System.out.println();

		Iterator<String> list2Iterator = list2.iterator();

		while (list2Iterator.hasNext()) {
			System.out.print(list2Iterator.next() + " - ");
		}

	}

}
