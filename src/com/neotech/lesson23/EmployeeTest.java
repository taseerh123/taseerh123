package com.neotech.lesson23;

public class EmployeeTest {
	

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.salary = 10000;
		emp.getPaid();
		
		System.out.println("-------------------");
		
		Contractor c = new Contractor();
		c.hourlyRate = 50;
		c.getPaid();
		
		
		
		FullTimeEmployee fte = new FullTimeEmployee();
		fte.salary = 15000;
		fte.getPaid();
		
	}

}
