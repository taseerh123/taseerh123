package com.neotech.lesson05;

public class NestedElseIf {

	public static void main(String[] args) {
		// Write a ava program to check student has completed the quiz
		// if thw student did the quiz, then check the score and give the evaluation
		// if the score is 90 or above, the print "a, great Job"
		// if the score is 80 to 90[. the print "B, Well Done!'
		// if the score is 70 to 80[, then print "C, you Passed!"
		// otherwise, print "Try harder next time

		boolean quizIsDone = true;
		int score = 80;
		
		if (quizIsDone)
		{
			if (score>= 90) {
				System.out.println("A, Great Job!");
			}
			else if (score >= 80) {
				System.out.println("B, welldone! ");
			}
			else if (score >= 70) {
				System.out.println("C, You Passed!");
			}
			else {
				System.out.println("Try Hard, Next Time!");
			}
		}
		else
		{
			System.out.println("You did not do the quit, you didnt pass");
		}
	}

}
