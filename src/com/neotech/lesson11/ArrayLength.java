package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "Oluwabunmi";
		names[1] = "Nazle";
		names[2] = "Ameen";
		names[3] = "Maya";
		names[4] = "Khen";
		int arrayLength = names.length;
		System.out.println(arrayLength);
		int[] scores = {90, 92, 93, 94, 95};
		System.out.println(scores.length);

	}

}
