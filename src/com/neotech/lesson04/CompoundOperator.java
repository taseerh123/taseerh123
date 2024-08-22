package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {

		// aka shorthand operator
		int num = 100; // we have a code num--> which should point to 100

		System.out.println(num);

		num = 150;
		System.out.println(num);

		num = num + 150; // we are reassigning, but this means add 150 to the current value of num
		System.out.println(num);
		// we can do this operation in a shorter way -- we call this as compound/
		// shorthand operator
		num += 50;// num = num +50; +=
		System.out.println(num);

		num -= 100;
		System.out.println(num);

		num /= 5;
		System.out.println(num);

		num *= 6;
		System.out.println(num);

		num %= 5;
		System.out.println(num);
	}

}
