package com.DataStructure;
import java.util.Scanner;

/**
 * Write a program that asks the user's name, and then greets the user by name.
 * Before outputting the user's name, convert it to upper case letters. For example,
 * if the user's name is Fred, then the program should respond
 * "Hello, FRED, nice to meet you!".
 * 
 * 
 * @author ShuqinYe
 *
 */

public class GreetUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);
		
		String userName;
		
		/* Get the user to input the name.*/
		System.out.println("Hi, there, what is your name?");
		userName = stdin.nextLine();
		
		// Convert the name to uppercase letters.
		userName = userName.toUpperCase();
		
		// Greet the user.
		System.out.println("Hello, " + userName + ", nice to meet you!");
		
		
	}

}
