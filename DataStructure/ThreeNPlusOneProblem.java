package com.DataStructure;
import java.util.Scanner;
/**
 * "Given a positive integer, N, define the '3N+1' sequence starting from N as follows: 
 * If N is an even number, then divide N by two; but if N is odd, then multiply N by 3 and 
 * add 1. Continue to generate numbers in this way until N becomes equal to 1. For example, 
 * starting from N = 3, which is odd, we multiply by 3 and add 1, giving N = 3*3+1 = 10. 
 * Then, since N is even, we divide by 2, giving N = 10/2 = 5. We continue in this way, 
 * stopping when we reach 1. The complete sequence is: 3, 10, 5, 16, 8, 4, 2, 1.

"Write a program that will read a positive integer from the user and will print out 
the 3N+1 sequence starting from that integer. The program should also count and print 
out the number of terms in the sequence."

Note:
1. Don't use integer values in the if-condition -- it needs a boolean value.
   Stick strictly to the rules -- boolean values for conditions.
2. while loop -- mind the condition for it to continue, not stop.
              -- under what condition does it never stop? have to write foolproof programs.

 * @author ShuqinYe
 *
 */


public class ThreeNPlusOneProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);	// A Scanner object with the value of 
												// standard input.
		
		int c;	// Counter of the number of terms.
		int N;	// User input value.
		
		System.out.println("Please input a positive integer: ");	// Instruct the user to input a value.
		N = stdin.nextInt();	// Get user input
		stdin.nextLine();		// Discard the rest of the same line input.
		
		c = 1;	// Initialize the counter.
		while (N != 1) {
			System.out.print(N + " ");
			if (N % 2 == 1) {	// N is odd.
				N = 3*N + 1;	// Update N value.
			}
			else {		// N is even.
				N = N/2;	// Update N value.
			}
			c++;	// Update the counter.
			
		}
		
		System.out.println(N);
		System.out.printf("The total number of terms in the sequence is %d\n", c);
		
		
		
		
		
		
		
		
	}

}
