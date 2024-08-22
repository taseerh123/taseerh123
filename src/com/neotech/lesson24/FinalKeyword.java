package com.neotech.lesson24;

public class FinalKeyword {
	
public static String str = "Hello!";
	
	//this is a final variable!
	public static final String str1 = "Bye";
	
	
	public static void main(String[] args) {
		
		
		
		str = "Hi!";//I am reassigning a value!
		//str1 = "Goodbye!"; //Compiler Error 

		//local variable
		
		final String finalStr = "Java is so much fun - Tima!";
		//can I change finalStr --> no I cant
		//finalStr = "Java is not so much fun!";
	
	}
	
	//lets create a final method
	public final void hello()
	{
		System.out.println("Hello from final method!");
	}
	
	//can I overload a final method?  -- YES
	public final void hello(String str)
	{
		System.out.println("Hello " + str);
	}

}


class SubClass extends FinalKeyword
{
	//lets try overriding the hello()
	
//	public final void hello()
//	{
//		System.out.println("Try to override a final method, but we cannot do that!!");
//	}
	
	
	public void hello(int num)
	{
		System.out.println("This is possible -- different signature -- different method!");
	}
	

}
