package com.neotech.lesson09;

public class Recap {

	public static void main(String[] args) {
		//print Good Morning 5 times or is there solution to do it in easier fashion!
		int count = 1;
		while (count <=5) {
			System.out.println("good morning");
			count = count + 1;
		//count +=1 //shorthand operator
			//count++ //increment
		}
System.out.println("----------");
//using do-while loop when you want to check without any condition once 
int num = 1;
do { 
	System.out.println("good morning");
num++;
} while (num <= 5);
System.out.println("--------");

int m = 10;
while(m < 5) {
	System.out.println("Today is a woonderful day!");
	m++;
}
do {
	System.out.println("Today is a woonderful day!");
	m++;
}while (m < 5);
	}

}
