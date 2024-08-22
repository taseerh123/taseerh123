package com.neotech.lesson23;

public class Programming {
	/*
	 Create a class named 'Programming'. While creating an
	    object of the class, if nothing is passed to it, then the
	    message "I love programming languages" should be
	    printed. If some String is passed to it, then in place of
	    "programming languages" the value variable should be
	    printed. Example, if we pass "Java", then "I love Java"
	    should be printed. 
	
	 */
	
	
	
	//Even if I do not create a constructor, the default constructor is executed.
	//By creating constructors we get to have a say on how the object is created.
	
	//We can modify (or even decide not to use) the default constructor.
	Programming()
	{
		System.out.println("I love programming languages!");
	}
	
	
	Programming(String str)
	{
		System.out.println("I love " + str + "!");
	}
	
	
	
	public static void main(String[] args) {
		
		Programming p1 = new Programming();
		Programming p2 = new Programming("JAVA");
		
	}
	
}
