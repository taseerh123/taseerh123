package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		//Create an arrayList with 6 names. 
				//Have at least 2 duplicates. 
				//How can you remove the duplicates from the ArrayList?

				List<String> ls = new ArrayList<>();
				ls.add("Abeera");
				ls.add("Iana");
				ls.add("Iana");
				ls.add("Nargiza");
				ls.add("Ebru");
				ls.add("Abeera");
				
				System.out.println(ls);
				
				//LinkedHashSet	-- no duplicates, keep the insertion order
				Set<String> lhs = new LinkedHashSet<>();
				lhs.addAll(ls);
				System.out.println(lhs);
				
				//HashSet -- no duplicates, no order
				Set<String> hs = new HashSet<>(ls);
				System.out.println(hs);
				
				
				//TreeSet -- no duplicates, ascending order
				Set<String> ts = new TreeSet<>();
				ts.addAll(ls);
				System.out.println(ts);
				
				
				//How do I check if an element exists in a Set?
				if (lhs.contains("Abeera"))
				{
					System.out.println("Contains Abeera");
				}
				
				//how can I access a specific element of the set?
					//I can convert it to a list
				List<String> list = new ArrayList<>(ts);
				list.add(1,"Preethi");
				
				System.out.println(list);
				
				//get an element at index 3?
				System.out.println(list.get(3));
				
				
				//Can I convert the set to an array??? Yes
				Object[] array = lhs.toArray();
				
				System.out.println("------------");
				System.out.println(Arrays.toString(array));
				
				Arrays.sort(array);
				System.out.println(Arrays.toString(array));
				//Arrays is a utility class for dealing with arrays
				
				//for collections we have another utility class
				Collections.sort(list);
				System.out.println(list);
				
				

	}

}
