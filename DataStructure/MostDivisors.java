package com.DataStructure;

/**
 * http://www.cs.cmu.edu/~mrmiller/15-121/
 * Exercise 3.2
 * Which integer between 1 and 10000 has the largest number of divisors, and how many 
 * divisors does it have?
 * Write a program to find the answers and print out the results. 
 * 
 * It is possible that several integers in this range have the same, maximum number of 
 * divisors. Your program only has to print out one of them. An example in Subsection 
 * 3.4.2 discussed divisors. The source code for that example is CountDivisors.java.

You might need some hints about how to find a maximum value. The basic idea is to go 
through all the integers, keeping track of the largest number of divisors that you've 
seen so far. Also, keep track of the integer that had that number of divisors.

Note:
1. for loops, separate the tracking variables & the result variables.
   (it's easier to build the logic as well)

 * @author ShuqinYe
 *
 */

public class MostDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxDivisorNumber = 1; 	// The integer that has most number of divisors.
		int maxDivisor = 0; 		// The max number of divisors the integer can have between 1-10000.
		
		int number = 1; 		// One integer between 1 and 10000.
		int divisorCount = 0;		// Number of divisors.
		int testDivisor; 		// A number between 1 and the tested integer
								// used for testing whether it's the divisor of the integer.
		
		
		for (number = 1; number <= 10000; number++) {
			for (testDivisor = 1; testDivisor <= number; testDivisor++) {
				if (number % testDivisor == 0) {
					divisorCount++;
				}		
			}
			if (divisorCount > maxDivisor) {
				maxDivisor = divisorCount;
				maxDivisorNumber = number;
				
			}
			divisorCount = 0;
			
		}
		
		System.out.printf("The integer that has the most number of divisors is %d, having %d divisors.\n", maxDivisorNumber, maxDivisor);
	}

}
