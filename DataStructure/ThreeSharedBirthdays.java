package com.DataStructure;

/**
 * http://www.cs.cmu.edu/~mrmiller/15-121/
 * 
 * Exercise 3.7:
An example in Subsection 3.8.3 tried to answer the question, How many random people do you have 
to select before you find a duplicate birthday? The source code for that program can be found in
 the file BirthdayProblem.java. Here are some related questions:

1. How many random people do you have to select before you find three people who share the 
same birthday? (That is, all three people were born on the same day in the same month, but
 not necessarily in the same year.)
 
2. Suppose you choose 365 people at random. How many different birthdays will they have? 
(The number could theoretically be anywhere from 1 to 365).

3. How many different people do you have to check before you've found at least one person with
 a birthday on each of the 365 days of the year?
 
 ignore the possibility of leap years.
 
Note:
1. birthdays[index] = (int)(Math.random()*365); => Don't omit the bracket for Math.random()*365.
   the integer will be evaluated first if you type (int)Math.random()*365
2. Again, if we want to count the number of unique occurrences, think the other way round, instead of
   thinking straight forward.(for letters & strings, we have the method of indexOf(), but for array, we
   don't have anything. So we use boolean arrays to track instead. It's the same concept when the target
   that needs to be found to be unique belongs to a certain set only.)
3. If the loop has to be executed at least once, or to use a always-true while -- that is equal to 
   have a do-while loop for the execution.
 
 
 * @author ShuqinYe
 *
 */

public class ThreeSharedBirthdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Question 1 */
		
/*		
		int[] birthdays;	// Declare birthdays
		int count;				// Declare counter for birthdays
		int day;				// Declare random generated days
		
		birthdays = new int[365];
		count = 0;
		
		
		while (true) {
			day = (int)(Math.random()*365);
			count++;
			
			if (birthdays[day] == 2) {
				System.out.println("Three same birthdays are found. Job done!");
				System.out.printf("The number of loop execution is %d.\n", count);
				break;
			}
			
			birthdays[day]++;
			
		}
		
*/		
		
		
		/* Question 2 */
		
/*
		
		int[] birthdays = new int[365]; 	// Initialize the number of birthdays for 365 people.
											// this variable can be happily deleted!!!!!!
		int index; 					// The index of the birthdays.
		boolean[] uniqueBday = new boolean[365];			// The array that counts whether a birthday exists.
		int uniqueBdays = 0;			// The number of unique birthdays.
		
		for (index = 0; index < birthdays.length; index++) {
			birthdays[index] = (int)(Math.random()*365);
			uniqueBday[(birthdays[index])] = true;
		}
		
		for (index = 0; index < uniqueBday.length; index++) {
			if (uniqueBday[index] == true) {
				uniqueBdays++;
			}
		}
		
		System.out.printf("If we choose 365 people at random, they will have %d different "
				+ "birthdays.\n", uniqueBdays);
		
*/		
		
		/* Question 3 */
		
		/* Another way is to have a tracking variable to store the number of unique days that 
		 * has been encountered!!!! - This is easier, just track how many false has been converted
		 * to true!*/
		
		boolean[] bdays = new boolean[365];		// Each element represents one birthday, when the 
												// value is false, noboday has the birthday; when
												// the value is true, at least one person has the
												// birthday.
		int count = 0;			// The number of different people checked.
		int index;				// The index for the birthdays.
		boolean track = true;	// True: all birthdays appeared; false: not all birthdays appeared.
		
		do {
			bdays[(int)(Math.random()*365)] = true;
			count++;
			for (index = 0; index < 365; index++) {
				if (bdays[index] == false) {
					track = false;
					break;
				}
				track = true;
			}
			
		} while (track == false);
		
		
		System.out.printf("We have to check at lease %d people to find at least one person with a "
				+ "birthday on each of the 365 days.", count);
		
		
		
		
	}

}
