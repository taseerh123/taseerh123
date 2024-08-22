package com.neotech.lesson26;

public class EmployeeTest {

	public static void main(String[] args) {
Employee emp = new Employee();
		
		//because the variables are private
		//I cannot access them directly here
		// emp.name = "Mahwish";
		// emp.age = 27;
		// emp.salary = 5000;
		
		
		//if you want to set values, you need to use a setter
		//if you want to get values, you need to use a getter
		
		emp.setName("Umut");
		emp.setAge(25);
		emp.setSalary(5000);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		

	}

}
