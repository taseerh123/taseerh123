package com.neotech.lesson20;

public class Student {
	
	String name;
	int grade1, grade2, grade3;
	
	Student(String studentName, int g1, int g2, int g3){
		name = studentName;
		grade1 = g1;
		grade2 = g2;
		grade3 = g3;
		
	}	
	
	int average(){
		return(grade1 + grade2 + grade3) / 3;
	}	
	
	
	

	public static void main(String[] args) {
		Student st1 = new Student("Tima", 90, 98, 99);
		Student st2 = new Student("Emre", 85, 95, 100);
		Student st3 = new Student("Uygar", 60, 70, 90);
		System.out.println(st1.name + " has avg " + st1.average());
		System.out.println(st2.name + " has avg " + st2.average());
		System.out.println(st3.name + " has avg " + st3.average());
		
		st3.grade3 =100;
		System.out.println(st3.name + " has avg " + st3.average());
	}

}
