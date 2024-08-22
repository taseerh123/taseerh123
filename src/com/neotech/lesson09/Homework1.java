package com.neotech.lesson09;

public class Homework1 {

	public static void main(String[] args) {
		// Write a program using while loop that calculates the sum of even nos (1-10)
		
		
		int i=0;
		int sum= 0;
		//ist way
		while (i <= 10) {
			if(i % 2 ==0) {
				sum += i;
				
			}
			i++;
			}
		System.out.println("sum is: " + sum);
		
		//2nd way
		int m=0;
		int sum2=0;
		while (m <=10) {
			sum2 +=m;
			m +=2;
		}
		System.out.println("sum2 is: " + sum2);
		}

	}


