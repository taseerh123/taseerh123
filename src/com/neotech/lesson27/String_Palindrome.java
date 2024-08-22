package com.neotech.lesson27;

public class String_Palindrome {

	public static void main(String[] args) {
		int num = 1234;

		isPalindrome(num);
	}

	public static boolean isPalindrome(int num) {

		// if I could convert to string --> reverse and check!!!
		// digits ---> 1001 % 10 ---> 1
		// assign the number to the rev
		// num ----> num / 10

		int rev = 0;

		while (num != 0) {
			int digit = num % 10;
			rev = rev*10 + digit;
			num = num / 10;
		}
		
		return num == rev;


	}

}
