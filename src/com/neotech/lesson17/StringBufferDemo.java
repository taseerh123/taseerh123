package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {
		String a = "Hello";
		String b = new String ("Hello");
		
		//mutable string classes
		//StringBuffer
		//StringBuilder
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		
		a.concat(" All");
		System.out.println(a);
		
		sb.append(" All!");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
		String substr = sb.substring(2, 7);
		System.out.println(substr);
		
		
		//stringbuilder
		StringBuffer strBuff = new StringBuffer("some string here");
		StringBuilder strBuild = new StringBuilder("Some string here");
		
		strBuild.append(" some more text ");
		System.out.println(strBuild);

	}

}
