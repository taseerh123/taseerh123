 package com.neotech.lesson24;

public class CreditCard {
	
	/*
	 * 
	 * 
	 * 	▪ Create a class CreditCard and define two variables, balance and interest. 
	 * 	▪ Create an instance method that will calculate the interest based on the given balance. 
	 * 	▪ Create 2 subclasses: Visa and AX. In AX class override the method calculate interest. 
	 * 	▪ Call the method by creating an object of each of the three classes.
	 */
		
		
		double balance, interest;
		
		//Using only a parametrized constructor forces anyone trying to create an object (or to inherit this class)
		//to send the required parameters in the constructor
		
		// CreditCard(){}
		
		public CreditCard(double balance)
		{
			this.balance = balance;
		}
		

		public void calculateInterest()
		{
			interest = 5;
			System.out.println("The interest rate is " + interest +"%!");
		}
		
		
	}

	class Visa extends CreditCard
	{

		public Visa(double balance) {
			super(balance);
		}

		@Override
		public void calculateInterest() {

			if (balance < 10000)
			{
				interest = 15;
			}
			else
			{
				interest = 20;
			}
			System.out.println("The VISA interest rate is " + interest +"%" );

		}
		
		
		public void cashback()
		{
			System.out.println("Visa gives 3% cashback!");
		}

		
		
		
	}


	class AX extends CreditCard
	{

		public AX(double balance) {
			super(balance);
		}

		//@Override - is not required
		//1. used for readability - to understand immediately (you and everyone) that you are overriding
		//2. it enforces the same signature rule
		
		@Override
		public void calculateInterest() {

			if (balance < 5000)
			{
				interest = 4.5;
			}
			else
			{
				interest  = 7.5;
			}
			
			System.out.println("The AX interest rate is " + interest + "%");
		}

		

}
