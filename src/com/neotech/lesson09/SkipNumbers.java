package com.neotech.lesson09;

public class SkipNumbers {

	public static void main(String[] args) {
		//print number 10 to 1, skip 3,6 and 9
 for(int i=10; i >=1; i--) {
	 if(i == 3 || i == 6 || i == 9) {
		 continue;
	 }
	 System.out.print(i + " ");
 }
 
 System.out.println();
 
 //print no from 20 to 40
 //but skip 27 to 33
  for (int i=20; i<=40; i++) {
	  if(i ==27 || i ==33) {
		  continue;
	  }
	  System.out.print(i + " ");
  }
  
  System.out.println();
  
  for (int i=20; i<=40; i++) {
	  if(i >=27 && i <=33) {
		  continue;
	  }
	  System.out.print(i + " ");
  }
	}

}
