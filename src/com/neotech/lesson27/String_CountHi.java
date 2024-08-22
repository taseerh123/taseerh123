package com.neotech.lesson27;

public class String_CountHi {

	public static void main(String[] args) {

		String str = "hidfsg hi hello here";

		String[] strArr = new String[str.length() - 1];

		for (int i = 0; i < str.length() - 1; i++) {
			strArr[i] = str.substring(i, i + 2);
		}

		int count = 0;
		for (String temp : strArr) {
			if (temp.equals("hi")) {
				count++;
			}
		}
		System.out.println(count);

	}

}
