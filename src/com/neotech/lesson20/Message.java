package com.neotech.lesson20;

public class Message {
	 
	Message(){
		System.out.println("default constructor");
	}
	
	Message(String str){
		this();
		System.out.println("constructor with message: " + str);
	}
	
	
	public static void main(String[] args) {
		
		Message msg1 = new Message();
		
		Message msg2 = new Message("hello");

	}
	
}
