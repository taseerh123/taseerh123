package com.neotech.lesson03;

public class Task1 {

    public static void main(String[] args) {
        String name = "Taseer";
        String lastName = "Hussain";
        char grade = 'A';  // Note: This variable 'grade' is declared but not used.
        String city = "Enschede";
        String state = "Overijssel";  // Corrected spelling from "Overjissel" to "Overijssel".
//        re-assigning
        grade = '@'; 
        
        // Corrected System.out.println with proper concatenation and spacing
        System.out.println("My name is " + name + " and my lastname is " + lastName + ".\nI live in the city of " + city + ", state of " + state + "." + "\nMy grade is " + grade);
    }
}
