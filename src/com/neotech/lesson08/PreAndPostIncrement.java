package com.neotech.lesson08;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		// ++a
		// --a
		// a++
		// a--
		int x;
		int y = 20;

		x = y++;
		// this is a post increment
		// 1. perform the operation-- assign the value of y tox
		// 2. appky the increment-- increase the value of y by 1

		System.out.println(x);
		System.out.println(y);
		
		int a;
		int b = 10;   //pre-increment
		//b +=1;
		//a = b
		a = ++b;
		System.out.println(a);
		System.out.println(b);
		
		int c;
		int d =5;
		c = d--;
		//post-decrement
		//c = d;
		//d -= 1;
		System.out.println(c);
		System.out.println(d);
		
		int e;
		int f = 8;
		e = --f;
		System.out.println(e);
		System.out.println(f);
		
		int num = 10;
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(++num);
		System.out.println(--num);//subtract 1 and then print
		System.out.println(num--);// print 11 and then subtract 1
		System.out.println(num);// print 10
	}

}
