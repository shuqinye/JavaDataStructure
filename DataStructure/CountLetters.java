package com.DataStructure;
import java.util.Scanner;

/**
Consider the problem of finding which of the 26 letters of the alphabet occur in a given
 string. For example, the letters that occur in "Hello World" are D, E, H, L, O, R, and W.
  More specifically, we will write a program that will list all the letters contained in
   a string and will also count the number of different letters. The string will be input
    by the user.
    
Note: 
1. Characters can also be count variables.
2. If the result is selected from a unique set of values, then we can literally count the 
   result values instead of starting from the target input! (change perspective to solve the
   problem!!!!!, great.)

 * @author ShuqinYe
 *
 */

public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Use integer as count. */
		
		// This algorithm originates from the target string itself and count them in if 
		// the letter appears unique.
		
/*		Scanner stdin = new Scanner(System.in);
		
		String inputLetters;			// User input letter.
		String uniqueLetters = "";		// Unique letters contained in the input.
		String letter;					// Character contained in the input.
		int countLetters;				// Counter for the input.
		int countUnique = 0;				// Counter for the unique letters.
		
		System.out.println("Please input a line of text: ");
		inputLetters = stdin.nextLine();			// Get user input letters.
		inputLetters = inputLetters.toUpperCase();	// Convert all input letters to upper case.
		
		for (countLetters = 0; countLetters < inputLetters.length(); countLetters++) {
			letter = inputLetters.substring(countLetters, countLetters+1);
			if ( !letter.equals(" ") && !uniqueLetters.contains(letter)) {
				uniqueLetters = uniqueLetters.concat(letter);
				countUnique++;
			}
		}
		
		
		System.out.printf("The letters contained in the string you've typed are: %s\n", uniqueLetters);
		System.out.printf("The number of different letters are: %d\n", countUnique);
		
*/
		
//------------------------------------------------------------------
//------------------------------------------------------------------
		
		/* Use character as count. */
		// This method starts from the 26 alphabets and largely simplifies the algorithm.
		// Characters can be the count variables themselves. Remember this!!!!
		
		Scanner stdin = new Scanner(System.in);
		
		char count;				// Count the 26 alphabets.
		int countLetters = 0;	// Count the number of letter appeared in the input.
		String inputLetters; 	// Get user input letters.
		
		System.out.println("Please input a line of text: ");
		inputLetters = stdin.nextLine();			// Get user input letters.
		inputLetters = inputLetters.toUpperCase();	// Convert all input letters to upper case.
		
		for (count = 'A'; count <= 'Z'; count++) {
			if (inputLetters.indexOf(count) >= 0) {
				countLetters++;
				System.out.print(count + " ");			
			}
	}

		System.out.println();
		System.out.printf("The number of different letters you've input are %d\n.", countLetters);
		
}
}
