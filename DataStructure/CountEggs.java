package com.DataStructure;
import java.util.Scanner;

/**
 * If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over.
 * (This is essentially the definition of the / and % operators for integers.)
 * Write a program that asks the user how many eggs she has and then tells the user
 * how many dozen eggs she has and how many extra eggs are left over.

A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user
how many gross, how many dozen, and how many left over eggs she has. For example,
if the user says that she has 1342 eggs, then your program would respond with:

Your number of eggs is 9 gross, 3 dozen, and 10.


since 1342 is equal to 9*144 + 3*12 + 10.



 * @author ShuqinYe
 *
 */

public class CountEggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner( System.in );
		int numEggs;
		int gross, dozen, leftOver;
		
		System.out.print("How many eggs do you have? ");
		numEggs = stdin.nextInt();
		stdin.nextLine();	// Discard the rest of input on the same line.
		
		gross = numEggs/144; 	// calculate the gross.
		dozen = (numEggs%144)/12;	// numEggs%144 is the number of eggs after taking out all grosses.
		leftOver = numEggs%12;		// leftover is the number of eggs after taking out all dozen.
		
		/* Output the result.*/
		System.out.printf("Your number of eggs is %d gross, %d dozen, and %d.", gross, dozen, leftOver);
		
		
		
		
		
		
	}

}
