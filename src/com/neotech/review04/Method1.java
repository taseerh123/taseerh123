package com.neotech.review04;

public class Method1 {
	void sayGreetingsWithNumber(String greeting, int n) {
		for (int i = 1; i<=n; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}
	public static  void main(String[] args) {
		Method1 n = new Method1();
		n.sayGreetingsWithNumber("Merhaba", 2);
		
	
	}
}



