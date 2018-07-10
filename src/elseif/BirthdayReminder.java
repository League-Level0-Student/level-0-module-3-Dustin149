
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "January 31st";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String Response = JOptionPane.showInputDialog("Enter a name to see their birthday. (Options: Mom, Dad, or Creator)");
		// 3. Print out what the user typed
		System.out.println(Response);
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		
		if (Response.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, "Mom's birthday: "+momsBirthday);
		}else if (Response.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, "Dad's birthday: "+dadsBirthday);
		}else if (Response.equalsIgnoreCase("creator")) {
			JOptionPane.showMessageDialog(null, "Creator's birthday: "+myBirthday);
		}else {
			JOptionPane.showMessageDialog(null, "I'm sorry but I don't know who ["+Response+"] is");
		}

	} 
}
