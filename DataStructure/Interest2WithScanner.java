package com.DataStructure;
import java.util.Scanner;

/**
 * Note: the scanner is like a cursor, whenever the methods of nextxxx() are called
 * two things will hapen: 
 * 1. the cursor will move to a certain place.
 * 2. the skipped value will be returned.
 * 
 * A scanner can be user input (System.in) or a string object.
 * 
 * Make sure you know where the cursor is placed after the command is executed.
 * 
 * nextLine() -- the line separator is skipped.
 * next() -- the delimiter is skipped (by default is whitespace).
 * nextInt(), nextDouble(), nextFloat(), nextBoolean() -- cursor stops at the end of the value.
 * 
 * 
 * @author ShuqinYe
 *
 */

public class Interest2WithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner( System.in );
		
		String name;     // The user's name.
        String email;    // The user's email address.
        double salary;   // the user's yearly salary.
        String favColor; // The user's favorite color.
        int age; 		 // The user's age.
        
        System.out.print("Please input your name: ");
        name = stdin.nextLine(); 		// Get the user's name.
               
        System.out.print("Please input your email: ");
        email = stdin.nextLine(); 		// Get the user's email.
        
        System.out.print("Please input your salary: ");
        salary = stdin.nextDouble(); 	// Get the user's salary.
        stdin.nextLine(); 				// Move the scanner past the line separater the user
        								// will enter to input the salary.
        
        System.out.print("What's your favorite color?");
        favColor = stdin.nextLine(); 	// Get the user's favorite color.

        System.out.print("Please input your age: ");
        age = stdin.nextInt(); 	// Get the user's age.
		
        System.out.print("What's your favorite color?");
        favColor = stdin.nextLine(); 	// Get the user's favorite color.
	}

}
