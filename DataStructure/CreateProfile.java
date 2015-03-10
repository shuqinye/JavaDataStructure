package com.DataStructure;



public class CreateProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name;     // The user's name.
        String email;    // The user's email address.
        double salary;   // the user's yearly salary.
        String favColor; // The user's favorite color.
        
        TextIO.put("Please input your name: ");
        name = TextIO.getln();
        TextIO.put("Please input your email: ");
        email = TextIO.getln();
        TextIO.put("Please input your salary: ");
        salary = TextIO.getlnDouble();
        TextIO.put("What's your favorite color?");
        favColor = TextIO.getln();
        
        TextIO.writeFile("UserProfile.txt");
        TextIO.putln("Name:	" + name);
        TextIO.putln("Email: 	" + email);
        TextIO.putln("Salary: 	" + salary);
        TextIO.putln("Favorite Color:	" + favColor);
        
        TextIO.writeStandardOutput();
        TextIO.putln("Thank you. Your profile has been created to the file profile.txt");
        
		
		
	}

}
