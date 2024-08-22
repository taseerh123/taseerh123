package com.neotech.lesson20;

public class ThisKeyword {
	
	int a,b;
	
	
	public ThisKeyword() {
			
	}
	
	
	ThisKeyword(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	
	
	void sum(int a, int b) {
		
		System.out.println("sum of local variables: " + (a + b) );
		
		System.out.println("sum of instance variables: " + (this.a + this.b) );
		
	}	
	
	
	
	

}
