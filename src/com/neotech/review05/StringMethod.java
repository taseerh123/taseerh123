package com.neotech.review05;

public class StringMethod {
	
	public static void main(String[] args) {
		String str = "Pershendetje";
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
		boolean equal = str.equals("PERSHENDETJE");
		System.out.println("equal -> " + equal);
		
		System.out.println(str.equalsIgnoreCase("PERSHENDETJE"));
		
		System.out.println("---------------------");
		
		System.out.println(str.contains("SH"));
		System.out.println(str.contains(   "SH".toLowerCase()   )); 
		System.out.println("Does Pershendetje start with Pershendetje?");
		System.out.println(str.startsWith("Pershendtje"));
		
		String name = "Risha" + "-" + "Tan";
		System.out.println(name);
		
		System.out.println("-----------");
		String str2 = "       Elma      is Happpy      ";
		System.out.println(str2.trim().length());
		System.out.println(str2.length());
		
		System.out.println("---------------");
		
		String str3 = "Bunmi is very smart";
		char letter = str3.charAt(2);
		System.out.println(letter);
		
		System.out.println("The index of letter 'm' is ->" + str3.indexOf('m'));
		
		int indexOfSecondM = str3.indexOf('m', 5);
		System.out.println("indexOfSecondM ->" + indexOfSecondM);
	}

}
