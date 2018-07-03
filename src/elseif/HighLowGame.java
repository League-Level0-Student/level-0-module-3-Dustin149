//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		System.out.println(random);
		boolean Continue = true;
		
		
		// 11. Repeat steps 1 to 10 ten times
			while (Continue == true){
			// 1. Ask the user for a guess using a pop-up window, and save their response 
				int Response = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 0-100."));
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
				if (Response == random) {
					JOptionPane.showMessageDialog(null, "Correct!");
					System.exit(0);
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
				}else {
					if (Response>random) {
						JOptionPane.showMessageDialog(null, "Too high! Try again.");
					}else {
						JOptionPane.showMessageDialog(null, "Too low! Try again.");
					}
				}
		// 13. Tell them they lose
			}
	}

}


