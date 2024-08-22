package com.neotech.lesson19;

public class Employee {
	//ACCESSS Modifiers:public,protected,default,private
	
	public static String company;
	public String name;
	protected String lastName;
	double salary;
	private int ssn;
	//methods with different access modifiers
	public void method()
	{
	System.out.println("I am a public method");	
	}
	
	protected void method2()
	{
		System.out.println("I am a protected method!");
	}
	void method3()
	{
		System.out.println("I am a default method!");
	}
	private void method4()
	{
		System.out.println("I am a private method");
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		company = "Neotech";
		emp.name = "Tima";
		emp.lastName = "Fakoly";
		emp.salary = 150000;
		emp.ssn = 123456;
		
		//let us try for methods
		emp.method();
		emp.method2();
		emp.method3();
		emp.method4();
		
	}
}
