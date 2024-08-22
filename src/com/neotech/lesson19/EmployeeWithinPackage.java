package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {
		Employee.company = "Neotech";
		Employee emp = new Employee();
		emp.name = "Sinem";
		emp.lastName = "Tok";
		emp.salary = 150000;
//		emp.ssn = 123456;// not visible
		
//		emp.phoneNumber = 12345; // this is different, it doesn't exist
		 emp.method();
		 emp.method2();
		 emp.method3();
//		 emp.method4();
	}

}
