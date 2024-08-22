package com.neotech.lesson18;


	

	public class Student {

//		Create a Class called Students 
//		▪ Create three variables studentName, studentID and numberOfStudents (should be a static variable)
//		▪ Create three objects of the Students Class
//		▪ Set the value for studentName, studentID and increment
//		the numberOfStudents for each object
//		▪ Print out total the number of students

		String studentName;
		int studentId;
		static int numberOfStudents;

		public static void main(String[] args) {

			Student student1 = new Student();
			student1.studentName = "Jud";
			student1.studentId = 1;
			Student.numberOfStudents++;

			Student student2 = new Student();
			student2.studentName = "Abit";
			student2.studentId = 2;
			Student.numberOfStudents++;

			Student student3 = new Student();
			student3.studentId = 3;
			student3.studentName = "Tima";
			Student.numberOfStudents++;

			System.out.println(numberOfStudents);
		}

	}


