package com.DataStructure;

/**
 * http://www.cs.cmu.edu/~mrmiller/15-121/
 * 
 * Exercise 3.6:

Exercise 3.2 asked you to find the number in the range 1 to 10000 that has the largest number of
 divisors. You only had to print out one such number. Revise the program so that it will print 
 out all numbers that have the maximum number of divisors. Use an array as follows: As you count
  the divisors for each number, store each count in an array. Then at the end of the program, you 
  can go through the array and print out all the numbers that have the maximum count. The output 
  from the program should look something like this:

Among integers between 1 and 10000,
The maximum number of divisors was 64
Numbers with that many divisors include:
   7560
   9240
   
Note: Please make sure you are very clear of the algorithms in real life!!!!!!!!
   
 * @author ShuqinYe
 *
 */



public class RevisedMostDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numOfDivsArray = new int[10000]; 	// The array that stores the number of divisors for each integer.
		
		int number = 1; 				// One integer between 1 and 10000.
		int numOfDivs = 0;				// Number of divisors.
		int testDivisor = 1; 				// A number between 1 and the tested integer
										// used for testing whether it's the divisor of the integer.
		
		
		for (number = 1; number <= 10000; number++) {
			for (testDivisor = 1; testDivisor <= number; testDivisor++) {
				if (number % testDivisor == 0) {
					numOfDivs++;
				}		
			}
			numOfDivsArray[(number-1)] = numOfDivs;
			numOfDivs = 0;
			
		}
		
		/* find the biggest number and return both the integer and the number of divisors */
		
		
		{
			int maxNumDiv = 1; 	// The maximum number of divisors.
			int index = 0;		// This value + 1 is the integer that has the maximum number of divisors.
			
			for (index = 0; index < numOfDivsArray.length; index++) {
				if (numOfDivsArray[index] >= maxNumDiv) {
					maxNumDiv = numOfDivsArray[index];
				}
			}
			
			System.out.print("Among integers between 1 and 10000,\nThe maximum number of divisors was "
							 + maxNumDiv);
			System.out.println();
			System.out.println("Numbers with that many divisors include:");
			
			for (index = 0; index < numOfDivsArray.length; index++) {
				if (numOfDivsArray[index] == maxNumDiv) {
					System.out.printf("%7d\n", index+1);
				}
			}
			
			
		}

		
	}

}
