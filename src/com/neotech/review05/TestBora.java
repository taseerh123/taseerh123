package com.neotech.review05;

public class TestBora {

	public static void main(String[] args) {
		Bora b = new Bora();
		
		b.addTwoNumbers();
		b.addTwoNumbersThatIGive(7, 5);
		int res1 = b.addTwoNumbersAndGiveMeTheGive();
		int res2 = b.addTwoNumbersThatIGiveAndGuveMeTheResult(6, 8);
		
		if(res2 == 14) {
			System.out.println("Good job Bora!");
		}else {
			System.out.println("I still love you!!!");
		}
		
		}
}
		
	


