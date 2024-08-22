package com.neotech.lesson35;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework {

	public static void main(String[] args) {
		//    Create a static method that will return a List of Exceptions.
	    //    Inside your method create objects of 4 exception classes using try 
		//	   and catch blocks and store them inside your list.
	    // Call your method inside main and print name and details of all Exception objects.
		

		System.out.println(getAllExceptions());
		
	//	List<Exception> exceptionList = getAllExceptions();
				
		//iterate on the exceptionList and call .getMessage() 
		Iterator<Exception> it = getAllExceptions().iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getMessage());
		}
	}

	
	//access modifier 	static/non-static	return type		name	(parameters)		
	public static List<Exception> getAllExceptions()
	{
		List<Exception> listToReturn = new ArrayList<>();
		
		//1st type: ArrayIndexOufOfBounds
		int[] intArray = {1, 2, 3, 4};
		try 
		{
			System.out.println(intArray[7]);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			listToReturn.add(aie);
		}
		
		
		
		//2nd type: ClassCastException
		try 
		{	
			Object d = 50.0; 
			Integer i = (Integer) d;
		}
		catch(ClassCastException cce)
		{
			listToReturn.add(cce);
		}
		
		
		//3rd type: NegativeArraySizeException
		try 
		{
			int[] negArray = new int[-2];
		}
		catch(NegativeArraySizeException nse)
		{
			listToReturn.add(nse);
		}
		
		
		//4th type: ArithmeticException
		
		int a = 5;
		int b = 0;
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException ae) {
			listToReturn.add(ae);
		}
		
		
		
		
		
		return listToReturn;
	}

}
