package com.neotech.lesson31;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();

		ht.put(3, "Khenrab");
		ht.put(2, "Iana");
		ht.put(1, "Umut");
		ht.put(4, "Jackeline");
		// ht.put(5, "");

		// ht.put(null, "Abiy");
		// ht.put(5, null);

		System.out.println(ht);
		System.out.println("size of my hashtable is " + ht.size());

		// what is the difference between HashMap and HashTable?

		// Hashtable is SYNCED, HashMap is not
		// Hashtable does not accept null for keys or values
		// HashMap is faster than HashTable since it is NOT thread safe

	}

}
