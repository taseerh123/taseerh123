package com.neotech.lesson34;

public class InfoAboutExceptions {

	public static void main(String[] args) {

		String str = "Hello";
		
		//how would we handle this??
		//try and catch
		
		try {
			
			//here we put code that we want to execute and in case an exception happens
			//then catch it --> this means show the user or yourself what happened
			
			//we put inside of the try block any code that depends on the line that will 
			//throw an exception
			
			char c = str.charAt(3);
			System.out.println(c);
			
			
			
			int a = 10; 
			int b = 0;
			
			System.out.println(a/b);
			
			
			
			
		}
		catch(StringIndexOutOfBoundsException sio)
		{
			//what do we do if an exception is caught
			sio.printStackTrace();
			System.out.println(sio);
			System.out.println(sio.getMessage());
			System.out.println("Do not try to get the wrong index!!!");
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
			System.out.println("Please do not divide by 0!!!");
		}
		catch(Exception e)
		{
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		//1. If an exception happens inside the try block, then the rest of the code in 
		//   the try block will not execute. It immediately goes to the respective catch
		//2. We can handle specific Exceptions properly
			//When we have multiple possible exceptions
			//a. we could keep 1 catch block and generalize them as Exception
			//b. use multiple catch blocks (one for each exception)
		
		
		
		
		
		
		System.out.println("End of code!");
	}

}
