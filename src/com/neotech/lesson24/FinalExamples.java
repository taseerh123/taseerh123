package com.neotech.lesson24;

public class FinalExamples {
	
	/*
 	Create a class FinalExamples that has one final String variable with an initial value and 
	one final method printVariable().
	
	In the main method create an object of FinalExamples class and try to reassign a value to 
	instance variable.
	
	Create a sub class of FinalExamples named ChildClass and try to override the 
	printVariable() method.
 
 */

final String str = "I love Java!";


final void printVariable()
{
	System.out.println(str);
}




public static void main(String[] args) {
	FinalExamples fe = new FinalExamples();
	//fe.str = "I dont like Java!"; //we cannot do that!!!
	
	
}

}

class ChildClass extends FinalExamples
{
//Not possible to override a final method!!!
//final void printVariable()
//{
//	System.out.println("Trying to override a final method!");
//}

}
