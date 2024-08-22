package com.neotech.lesson35;

public class ThrowKeyword {

	public static void main(String[] args){

		Exception ex = new Exception();
	
	//	throw ex;
	//	throwException();
		try {
			withdraw(2000, 5000);
		}
		catch (InsufficientFundsException ife)
		{
			System.out.println(ife.getMessage());
		}
		finally //this part is optional
		{
			System.out.println("Get your debit card back!");
			System.out.println("Other clean up code!!!");
		}
		
		
		
		System.out.println("can this print???");
		
	}
	
	
	public static void withdraw(int balance, int amount) throws InsufficientFundsException
	{
		if(amount > balance)
		{
		//	System.out.println("Not enough money!");
			throw new InsufficientFundsException("Insufficient Funds!!!!");
		}
	}
	
	
	
	
	
	public static void throwException()
	{
		throw new ArithmeticException();
	}

}



class InsufficientFundsException extends Exception
{
	public InsufficientFundsException(String msg)
	{
		super(msg);
}
}