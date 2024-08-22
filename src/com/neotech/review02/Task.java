package com.neotech.review02;

public class Task {

	public static void main(String[] args) {
		for (int age = 11; age <= 20; age++) {
			if (age ==13) {
				continue;
			}
			System.out.println("Happy Birthday son!" + " You turned " + age);
		}
System.out.println();


int age2 = 11;
while(age2 <=20) {
	age2++;
	
	if(age2 ==13) {
		continue;
	}
	System.out.println("Happy Birthday son!" + " You turned " + age2);
	
}
	}

}
