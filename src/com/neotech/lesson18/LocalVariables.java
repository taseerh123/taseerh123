package com.neotech.lesson18;

public class LocalVariables {
	public static void main(String[] args) {
	
		boolean flag = true;
		
		if(flag == true) {
			String answer = "yes";
			System.out.println(answer);
			System.out.println(flag);
		}
//		System.out.println(answer);
		System.out.println(flag);
		System.out.println("----------");
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
				System.out.println(i + " " + j);
			}
			System.out.println(i);
//			System.out.println(j);//the lifetime of j ended with th execution of the inner loop
			
			
			
	}
	}		
		
			
}

