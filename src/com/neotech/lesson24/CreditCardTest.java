package com.neotech.lesson24;

public class CreditCardTest {

	public static void main(String[] args) {

		CreditCard card1 = new CreditCard(5000); //I have to send the balance
		card1.calculateInterest();
		
		
		CreditCard card2 = new AX(7000); //up-casting
		card2.calculateInterest();
		
		
		CreditCard card3 = new Visa(15000); //up-casting
		card3.calculateInterest();
		//card3.cashback(); //Why cant we call it?? 
						// because a CreditCard object does not see that!!!
		
		//if you have to do something with the cashback(), then you need to 
		//make sure that it is accessible when up-casting
		//or that you assign the object to a Visa object
		Visa card4 = new Visa(6000);
		
		
		//What is the purpose of assigning all of these to a CreditCard object??
		CreditCard[] cards = {card1, card2, card3, card4, new AX(15000)};
		//can I also include card4???
		
		
		//display all interest rates using enhanced for loop
		for (CreditCard cc : cards)
		{
			cc.calculateInterest();
		}
		
		
		//display all interest rates using indexed for loop
		for (int i = 0; i < cards.length;i++)
		{
			CreditCard cc = cards[i];
			cc.calculateInterest();
		}
		
		
		
	}

	}


