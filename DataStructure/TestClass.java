package com.DataStructure;

/**
 * 
 Note:
 1. x++: value is the old value of x
    x--: value is the old value of x
    ++x: value is the new value of x
    --x: value is the new value of x
   Always use x++ & x--as individual statement, not as expressions!!!!
2. When you want to use the value of a variable, you have to make sure the variable
   is definitely assigned -- DEFINITE ASSIGNMENT!!!! Otherwise it's an error.
3. For nested loops: row first, then column -- because of the text typing order of computer.
4. Characters are actually integers, we can use them as counters as well.
5. Definite assignment problem exists in the Switch statement as well.
6. Arrays -- one is to declare, second is to allocate the number of elements.
 * @author ShuqinYe
 *
 */



public class TestClass {	
	
	enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
	enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
// each value of the enum type must be a simple identifier (they cannot be numbers, etc.)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Test of type case functions. */
		
//		int i;
//		double d = 5.67;
//		
//		i = (int)d;
//		d = (double)i;
//		System.out.printf("%1.1f" + "\n%d", d, i);
		
		/* Test of definite assignment: this will display an error 
		 * because y is not necessarily assigned a value - in the perspective
		 * of the compiler - it doesn't matter when the user thinks it will be 
		 * for sure assigned a value*/
		
//		int x = 5, y;
//		if (x > 0) {
//			y = 1;
//		}
//		if (x <= 0) {
//			y = 2;
//		}
//		
//		System.out.println(y);
		
		/* Nested loop test. */
		
//		int colNumber;
//		int rowNumber;
//		
//		for (rowNumber = 1; rowNumber < 20; rowNumber++ ) {
//			for (colNumber = 1; colNumber < 20; colNumber++) {
//				System.out.printf("%5d", colNumber * rowNumber);
//			}
//			System.out.println();
//			
//		}
		
		/* Arrays */
		
		int[] a1 = new int[20];
		int i;
		
		for (i = 0; i < a1.length; i++) {
			System.out.print(a1[i]);
			
		}

		
		
		
		
		
		
		
		
		

		
		
//		int z = 100;
//		System.out.println("My name is Shuqin" + " " + z);
//		
//		String s = "3.1415926";
////		double pi = Double.parseDouble(s);
//		double pi = Double.parseDouble(s);
//		System.out.println(pi);
//		
//		String ss;
//		ss = Double.toString(pi);
//		ss = String.valueOf(pi);
//		System.out.println(ss);
//		
//		int i = 567, i1;
////		int i1;
//		i1 = Integer.reverse(i);
//		System.out.println(i1);
//		System.out.println(Integer.toString(i));
////		System.out.printlne(i.doubleValue());
//		
//		String s1 = "ybyebyyebyebyeyyy";
//		String s2 = "bye";
//		if (s1 == s2) {
//			System.out.println("equal.");
//		}
//		else {
//			System.out.println("not equal.");
//		}
//		
//		System.out.println(s1.length());
//		System.out.println(s1.isEmpty());
//		
//		System.out.println(s1.toUpperCase());
//		
//
//		String[] sarray;
//		sarray = s1.split("y");
//		
//		for (i = 0; i < sarray.length; i++){
//		 
//		 System.out.println(sarray[i]);
//		}
//		
//		System.out.println(i);
//		System.out.println(s1.concat("hahah"));		//test the concatenate method
//		System.out.println(s1.substring(0, 5));		//test the substring method
//		System.out.println(s1.charAt(4));			//test the charAt method
//		System.out.println(s1.indexOf("ye"));
//		System.out.println(s1.contains("4"));
//		System.out.println(s1.replace('b', 'a'));
//		System.out.println(s1.replaceFirst("bye", "high"));
//		System.out.println(s1.replaceAll("bye", "high"));
//		System.out.println(Math.PI);
//		System.out.println(Math.sqrt(4.3455));
//		
//		
//		Day restDay;
//		Month vacationMonth;
//		
//		restDay = Day.MONDAY;
//		vacationMonth = Month.AUG;
//		
//		System.out.println(restDay);
//		
//
// /* text input output practice: format specifier*/ 
//		
//		i = 567000;				//integer
//		z = 34;					//integer
//		double d1, d2, d3;		//double for later use	
//		d1 = 1.345;
//		d2 = 3456.09;
//		d3 = Math.PI;
//		long l1 = 457800000;
		
//		System.out.printf("values of d1: %10.4f\n", d1);
		
/* textIO practice -- written by the teacher */
		
//		int userInput;
//		int square;
//		
//		System.out.print("\nPlease input a number: ");
//		userInput = TextIO.getlnInt();
//		square = userInput * userInput;
//		
//		System.out.println();
//		System.out.print("The square of the number you've entered is: " + square);
//		
//		
///* Test conditional operator*/
//		i1 = (i >= 1) && (z <= 1) ? 1 : 0;
//		System.out.println(i1);
		
		
		
		
		
		
		
		
		
		
	


		
		
		
		
	}
}
