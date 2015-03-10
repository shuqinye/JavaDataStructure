package com.DataStructure;
import java.util.Scanner;

/**
 * Write a program that reads one line of input text and breaks it up into words. The words should be
 *  output one per line. A word is defined to be a sequence of letters. Any characters in the input
 *   that are not letters should be discarded. For example, if the user inputs the line

He said, "That's not a good idea."
then the output of the program should be

He
said
That
s
not
a
good
idea

An improved version of the program would list "that's" as a single word. An apostrophe can be considered 
to be part of a word if there is a letter on each side of the apostrophe.

To test whether a character is a letter, you might use
(ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'). However, this only works in English and 
similar languages. A better choice is to call the standard function Character.isLetter(ch), 
which returns a boolean value of true if ch is a letter and false if it is not. This works for any
 Unicode character.
 
Note: 
1. Learn to use the print function -- print individual items!!!!!!! Don't think of printing blocks
   every time!!!! This can simplify procedures and codes sooo much!!!
2. If we need to track the last state and there are only two status, we can happily use boolean value
   to track!!!! We don't have to use number to track. (because there are only two states!!!!!)
 
 * @author ShuqinYe
 *
 */


public class BreakUpWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);
		
/* Use two pointers, one to track the index of input words, one to track the length of each word.
 * This is toooooooooooooo troublesome!!!!! Just make use of the print function will do!!!!!
 * The problem with this one is that I always want to print items as a chunk. I can actually make use
 * of the print function and print every CHARACTER individually, instead of printing every WORD.
 * 
 * 
 * 		String words; 		// Store the input line of words.
		String everyWord;	// Store every word of the line of input.
		
		int i = 0;				// Index of the input string.
		int wordLength = 0;		// Length of individual words.
		
		System.out.print("Please input a line of words: ");
		words = stdin.nextLine();
		
		for (i = 0; i < words.length(); i++) {
			while (Character.isLetter(words.charAt(i)) == true ) {
				wordLength++;
				i++;
			}
			System.out.println(words.substring(i - wordLength, i));
			wordLength = 0;
			
		}

*/
		
/*This method makes use of Scanner class to get the next token in the input. Great!
 * It's the improved version of the BreakUpWords program!
 * while there are more words in the string, get the next word and print it.

		
		String words; 		// Store the input words.
		String eachWord;	// Store each word.
		
		int i; 				// Track the index within each word.
		
		System.out.print("Please input a line of words: ");
		words = stdin.nextLine();
		
		Scanner read = new Scanner(words);
		
		while (read.hasNext() == true) {
			eachWord = read.next();
			for (i = 0; i < eachWord.length(); i++) {
				if (Character.isLetter(eachWord.charAt(i)) || eachWord.charAt(i) == '\'') {
					System.out.print(eachWord.charAt(i)); 			// Make use of the print method.
				}
			}
			System.out.println();
		}
		
*/

/* This method makes use of the print method and print each individual character one by one.
 * Tracking may not necessarily be a number, it can be a boolean value as well. Track the last 
 * print value!~ :-)
 * Please read others' programs more often, then you can learn!
 */
		
		String words;		// Store the input words.
		
		int i;				// Track the items of the string words.
		int noneLetter = 0; 	// Track the index of none letters between words.
								// This tracking variable can be changed to boolean type.
								// We can track the last state. 
		
		System.out.print("Please input a line of words: ");
		words = stdin.nextLine();
		
		
		
		for (i = 0; i < words.length(); i++) {
			if (Character.isLetter(words.charAt(i))) {
				System.out.print(words.charAt(i));
				noneLetter = 0;				// This tracking variable can be changed to boolean value.
			}
			else {
				noneLetter++;
				if (noneLetter == 1) {
					System.out.println();	
				}
			}
			
			
		}
		

	}

}
