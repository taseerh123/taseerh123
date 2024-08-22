package com.neotech.lesson08;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int x = 5;
		
		System.out.println(x);
		
		x = x + 1; //update the value of x
		System.out.println(x);
		
		
		x += 1; // we are updating using the shorthand operator
		System.out.println(x);
		
		x++;//post-increment ---> 1 to x
		System.out.println(x);

		
		x--; //post-decrement --> subtract 1 from x
		System.out.println(x);
		
		int y = 10;
		System.out.println(y++);//there are two things happening here!!
		//first action above is printing y
		//the second action is increment it
		
		int z = 10;
		
		int w = z++;// first do the operation and then increment z
				System.out.println(z);
				System.out.println(w);
	}

}
