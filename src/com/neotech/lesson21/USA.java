package com.neotech.lesson21;

public class USA {
	
	String state, stateCapital;

	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}
	

	public void displayState() {
		System.out.println(state);
	}
	
	public void displayStateCapital()
	{
		System.out.println(stateCapital);
	}
	
	public void displayInfo()
	{
		this.displayState(); // we're calling a method, inside another method to display the state
		displayStateCapital();//we don't have to use 'this', compiler will already know what we're referring to
	}

	
	public static void main(String[] args) {
		USA us1 = new USA("NY", "Albany");// new USA is the constructor
		
		us1.displayInfo();
	}
}

