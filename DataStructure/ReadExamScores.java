package com.DataStructure;

/**
 * Suppose that a file named "testdata.txt" contains the following information:
 *  The first line of the file is the name of a student. Each of the next three lines 
 *  contains an integer. The integers are the student's scores on three exams. Write a 
 *  program that will read the information in the file and display (on standard output)
 *   a message that contains the name of the student and the student's average grade on 
 *   the three exams. The average is obtained by adding up the individual exam grades 
 *   and then dividing by the number of exams.
 *   
 *   
 Note: whenever using printf, remember to put a line separator at the end.
 
 * @author ShuqinYe
 *
 */

public class ReadExamScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int score1, score2, score3;
		
		TextIO.readFile("testdata.txt");
		name = TextIO.getln();
		
		score1 = TextIO.getlnInt();
		score2 = TextIO.getlnInt();
		score3 = TextIO.getlnInt();
		
		System.out.printf("The student name is %s and his average grade on the three exams is %1.2f.%n", name, (score1 + score2 + score3)/3.0);
		
		
		
	}

}
