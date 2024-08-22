package com.neotech.lesson15;

public class MethodIntro {
	
	void greet () {
		System.out.println("hello");
		System.out.println("how are you doing?");
		System.out.println("bye!");
	}
	
	
	void greet2(String name) {
		System.out.println("hello "  + name);
		System.out.println("how are you doing? " + name);
		System.out.println("bye! " + name);
	}
	

	public static void main(String[] args) {
		MethodIntro intro = new MethodIntro();
		intro.greet();
		
		
		System.out.println();
		intro.greet2("Jennifer");
		
		System.out.println();
		intro.greet2("Janaa");
	}

}
