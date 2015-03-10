package com.DataStructure;
import java.util.Scanner;

/**
 * Write a program that helps the user count his change.
 * The program should ask how many quarters the user has, then how many dimes,
 * then how many nickels, then how many pennies.
 * Then the program should tell the user how much money he has, expressed in dollars.
 * 
 * 
 Note:
 1. sometimes when capturing the input keyed in by the user, we have to discard the 
 rest of the contents on the same line. Then we use nextLine();
 2. Basically, nextLine() is to scan the line separator and then put the pointer at the 
 end of the line separator. So that's why it can discard the rest of the content on the
 previous line.
 
 * @author ShuqinYe
 *
 */
public class CountChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner( System.in );
		
		int numQuarters, numDimes, numNickels, numPennies;
		double dollars;
		
		System.out.print("How many quarters do you have? ");
		numQuarters = stdin.nextInt();
		stdin.nextLine();	// Discard the extra stuff user keys in on the same line.
		
		System.out.print("How many dimes do you have? ");
		numDimes = stdin.nextInt();
		stdin.nextLine();	// Discard the extra stuff user keys in on the same line.
		
		System.out.print("How many nickels do you have? ");
		numNickels = stdin.nextInt();
		stdin.nextLine();	// Discard the extra stuff user keys in on the same line.
		
		System.out.println("How many pennies do you have? ");
		numPennies = stdin.nextInt();
		stdin.nextLine();	// Discard the extra stuff user keys in on the same line.
		
        /* Sum the changes. */
		dollars = 0.25*numQuarters + 0.10*numDimes + 0.05*numNickels + 0.01*numPennies;
		
		/* Output the total. */
		System.out.printf("You have %1.2f dollars in total.", dollars);
		
		
		
		
	}

}
