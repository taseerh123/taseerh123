package com.neotech.lesson19_1;

import com.neotech.lesson19.Employee;

public class EmployeeOutsidePackage {

	public static void main(String[] args) {
		Employee.company = "Neotech";
		
		Employee emp = new Employee();
		emp.name = "Sufiyan";
//		emp.lastName = "";
//		emp.salary = 150000;
//		emp.ssn = 1234;
		
		emp.method();
		

	}

}
