package com.DataStructure;
import java.util.Scanner;
/** This exercise asks you to write a program that tests some of the built-in subroutines
 *  for working with Strings. The program should ask the user to enter their first name
 *   and their last name, separated by a space. Read the user's response using 
 *   TextIO.getln(). Break the input string up into two strings, one containing 
 *   the first name and one containing the last name. You can do that by using the
 *    indexOf() subroutine to find the position of the space, and then using substring()
 *     to extract each of the two names. Also output the number of characters in each name,
 *      and output the user's initials. (The initials are the first letter of the first 
 *      name together with the first letter of the last name.) A sample run of the program 
 *      should look something like this:

Please enter your first name and last name, separated by a space.
? Mary Smith
Your first name is Mary, which has 4 characters
Your last name is Smith, which has 5 characters
Your initials are MS

Note: 
1, printf: %s can be the substitute for a string, not only numbers which are in its original
format.
2, string.charAt() => used to get one character. Don't use the substring method if you only
need to get one character.
3, string.substring() => when there is only one index, the whole string with the beginning 
index is returned.
4, Don't create variables, if not necessary.


 * @author ShuqinYe
 *
 */
public class GetNameInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);
		String name, firstName, lastName;	// User's name.
	    String firstInitial, lastInitial;		// User's initials.
		int indexSpace; 					// Index for whitespace.
		int firstNameCount, lastNameCount;	// Number of characters of names.
		
		System.out.println("Please enter your first name and last name, separated by a space.");
		name = stdin.nextLine();	// Get the user's name.
		
		indexSpace = name.indexOf(" ");	// Get the index of the whitespace.
		firstName = name.substring(0, indexSpace);	// Get the first name.
		lastName = name.substring(indexSpace + 1, name.length());	// Get the last name.
		
		firstNameCount = firstName.length();	// Get the number of characters for the first name.
		lastNameCount = lastName.length();		// Get the number of characters for the last name.
		
		firstInitial = firstName.substring(0, 1);	// Get the first name initial.
		lastInitial = lastName.substring(0, 1);		// Get the last name initial.
		
		System.out.println("Your first name is " + firstName + ", which has " + firstNameCount + " characters.");
		System.out.println("Your last name is " + lastName + ", which has " + lastNameCount + " characters.");
		System.out.println("Your initials are " + firstInitial + lastInitial);
		
		/* Alternatively */
		
		System.out.printf("Your first name is %s, which has %d characters%n", firstName, firstName.length());
		System.out.printf("Your last name is %s, which has %d characters%n", lastName, lastName.length());
		System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));
		
		
		
		
		
		
		
		
	}

}
