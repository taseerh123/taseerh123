package com.neotech.lesson20;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		obj.sum(20, 30);
		
		ThisKeyword obj2 = new ThisKeyword(100,300);
		obj2.sum(100, 200);

	}

}
