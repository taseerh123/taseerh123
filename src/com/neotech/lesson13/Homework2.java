package com.neotech.lesson13;

public class Homework2 {

	public static void main(String[] args) {
		String[][] students = {
				{"Jennifer", "Justin", "Betul", "Mona"},
					{"A", "B", "C", "A"}};
		System.out.println(students[0][0] + " " +  students[1][0]);
		System.out.println(students[0][1] + " " + students[1][1]);
		System.out.println(students[0][2] + " " + students[1][2]);
		//create a for loop to loop for one index
		for (int i = 0; i < students[0].length; i++)
		{
			if(students[1][i].equals("A") || students[1][i].equals("B"))
			{
		System.out.print(students[0][i] + " " + students[1] [i] + ";");
	}
	}
	}
	}
