package com.DataStructure;

/**
 * This program simulates the possibility of two people having the same birthday day in a
 * group of N people.
 * We use Math.random() to simulate a group of random people.
 * 
Note: 
1. Since birth days are fixed -- 365 days, we can use an array to represent it.
2. It's the same concept as using character counter as a reference to see unique letters.
3. From these two examples, we can have a clue of how to tackle this kind of problems:
    --- think in the perspective of target data sets (days or alphabets)
    --- think in the perspective of search data sets (birthdays itself or letters)

 * 
 * @author ShuqinYe
 *
 */


public class DuplicateBirthdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] birthdays;	// Declare birthdays
		int count;				// Declare counter for birthdays
		int day;				// Declare random generated days
		
		birthdays = new boolean[365];
		count = 0;
		
		
		while (true) {
			day = (int)(Math.random()*365);
			count++;
			
			if (birthdays[day] == true) {
				System.out.println("Duplicate birthdays are found. Job done!");
				System.out.printf("The number of loop execution is %d.\n", count);
				break;
			}
			
			birthdays[day] = true;
			
		}
		
	}

}
