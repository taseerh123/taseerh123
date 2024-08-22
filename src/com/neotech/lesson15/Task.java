package com.neotech.lesson15;

public class Task {
	
	void larger(int a, int b) {
		 if(a > b) {
			 System.out.println(a + " is larger than " + b);
		 }else if(b > a) {
			 System.out.println(b + " is larger than " + a);
		 }else {
			 System.out.println("The numbers are equal");
		 }
	 }
    void evenOrOdd (int num) {
	  if (num % 2 ==0) {
		  System.out.println(num + " is even");
	  }else {
		  System.out.println(num + " is odd");
	  }
  }
    void sayHello(String country) {
    	switch(country) {
    	case  "US":
    	case "UK":
    		System.out.println("Hello!");
    		break;
    	case "Mexico":
    		System.out.println("Hola!");
    		break;
    	case "Turkiye":
    		System.out.println("Merhaba");
    		break;
    		default:
    		System.out.println("I dont know how to say hello for " + country);
    		break;
    		}
    }
	public static void main(String[] args) {
		
		Task task = new Task();
		task.larger(33, 57);
		task.larger(7, 7);
		
		task.evenOrOdd(78);
		task.evenOrOdd(45);
		
		task.sayHello("US");
		task.sayHello("Turkiye");
		task.sayHello("Holland");
				
		
		}
	

}
