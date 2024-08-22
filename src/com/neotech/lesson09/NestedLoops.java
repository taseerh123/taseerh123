package com.neotech.lesson09;

public class NestedLoops {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			//System.out.println(i);
			for (int j =0; j <5; j++) {
				//System.out.print(j + " ");
				System.out.println("i:" + i + " j:" + j);
			}
			System.out.println();
		}
	}

}
