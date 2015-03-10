package com.DataStructure;

/**
 * How many times do you have to roll a pair of dice before they come up snake eyes?
 *  You could do the experiment by rolling the dice by hand. Write a computer program 
 *  that simulates the experiment. The program should report the number of rolls that 
 *  it makes before the dice come up snake eyes. (Note: "Snake eyes" means that both
 *   dice show a value of 1.) Exercise 2.2 explained how to simulate rolling a pair of
 *    dice.
 *    
Note:
1. do-while loop: when we cannot prime the loop and need the action at least once.
2. a while(true) loop is equal to a do-while loop. 
 * 
 * @author ShuqinYe
 *
 */


public class SnakeEyesDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;	// Initialize rolling counter.
		int die1, die2;	// Initialize rolling number for die 1 and die 2.
		
		while (true) {
			die1 = (int)(Math.random()*6) + 1;
			die2 = (int)(Math.random()*6) + 1;
			count++;
			
			if ((die1 == 1) && (die2 == 1)) {
				System.out.printf("It takes %d rolls to for the dice to come up snake eyes.\n", count);
				break;
				
			}
			
		}
		
	}

}
