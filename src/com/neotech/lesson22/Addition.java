package com.neotech.lesson22;

public class Addition {
	
	//method signature: void add(int, int)
		void add(int a, int b)
		{
			System.out.println(a+b);
		}
		
		
		//void add(int, int, int) --> method overloading by changing the number of parameters
		void add(int a, int b, int c)
		{
			System.out.println(a+b+c);
		}
		
		
		//void add(int, int) --> not method overloading because it has the same signature as above
//		void add(int c, int d)
//		{
//			System.out.println(c + d);
//		}
		
		//void add(double, double) --- method overloading by changing the parameter types
		void add(double a, double b)
		{
			System.out.println(a + b);
		}
		
		//void add(double, double, double)
		void add(double a, double b, double c)
		{
			System.out.println(a + b + c);
		}
		
		//void add(double, int)
		void add(double d, int i)
		{
			System.out.println(d + i);
		}
		//void add(int, double)
		void add(int i, double d)
		{
			System.out.println(i + d);
		}
		
		//void add(String, int)
		void add(String str, int i)
		{
			System.out.println("Cannot add them!!!");
		}
		
		void add(int i, String str)
		{
			System.out.println("Still cannot add them!!!");
		}
		

}
