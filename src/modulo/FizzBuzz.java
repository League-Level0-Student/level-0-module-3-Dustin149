//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package modulo;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

import loops.ShinyObjects;

import java.util.Random;

/**
* Fizz Buzz
* 
* In this project, we're going to build FizzBuzz. It's a children's game where
* you count from 1 to 20. Easy, right? Here's the catch: instead of saying
* numbers divisible by 3, say "Fizz". And instead of saying numbers divisible
* by 5, say "Buzz". For numbers divisible by both 3 and 5, say "FizzBuzz".
* 
* So the rules are:
* 		Any number divisible by 3 is replaced by the word fizz 
* 		Any number divisible by 5 is replaced by the word buzz. 
* 		Numbers divisible by both 3 and 5 become fizzbuzz.
* 
* Print your results to the console, or using JOptionPane if you like.
* 
* If your code is correct, the output will be:
*  
* 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz
* 
**/

public class FizzBuzz {
	public static void main(String[] args) {
		Random r = new Random();
		
		boolean GameEnded = false;
		boolean Won = false;
		int Turns = 0;
		String Number = "0";
		int RealNumber = 0;
		
		JOptionPane.showMessageDialog(null, "Let's play a game of FizzBuzz!");
		JOptionPane.showMessageDialog(null, "First, the rules...");
		JOptionPane.showMessageDialog(null, "If a number is divisible by 3, say 'Fizz'");
		JOptionPane.showMessageDialog(null, "And, if a number is divisible by 5, say 'Buzz'");
		JOptionPane.showMessageDialog(null, "However, if the number is divisible by 3 AND 5, say 'FizzBuzz'");
		JOptionPane.showMessageDialog(null, "Now, let's start!");
		JOptionPane.showMessageDialog(null, "0!");
		
		while (GameEnded == false) {
			RealNumber = (GetNextNumber(Number));
			Number = ""+RealNumber+"";
			
			System.out.println(Number);
			
			// Player's Turn
			JOptionPane.showMessageDialog(null, "Your Turn!");
			String Response = (JOptionPane.showInputDialog("What is your answer?"));
			JOptionPane.showMessageDialog(null, "You called ["+Response+"]!");
			boolean Correct = (CheckIfCorrect(Number,Response));
			if (Correct == true) {
				JOptionPane.showMessageDialog(null, "Correct!");
				RealNumber = (GetNextNumber(Number));
				Number = ""+RealNumber+"";
				Turns = Turns + 1;
				
				// Computer's Turn
				String ComputerAnswer = (ComputerTurn(Number));
				boolean ComputerCorrect = (CheckIfCorrect(Number,ComputerAnswer));
				
				if (ComputerCorrect == false) {
					JOptionPane.showMessageDialog(null, "Dang it, I lost!");
					GameEnded = true;
					Won = true;
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Incorrect!");
				GameEnded = true;
				Won = false;
			}
		}
		
		if (Won == true) {
			JOptionPane.showMessageDialog(null, "Congrats! You won!");
			JOptionPane.showMessageDialog(null, "All it took was "+Turns+" turns!");
		} else {
			JOptionPane.showMessageDialog(null, "You lost!");
			JOptionPane.showMessageDialog(null, "You survived "+Turns+" turns!");
		}
	}
	public static String ConvertValue(String Value) {
		int NumberValue = Integer.parseInt(Value);
		boolean DivisibleBy3 = false;
		boolean DivisibleBy5 = false;
		
		if ((NumberValue/3)*3 == NumberValue) {
			DivisibleBy3 = true;
		}
		if ((NumberValue/5)*5 == NumberValue) {
			DivisibleBy5 = true;
		}		
		
		System.out.println(DivisibleBy3);
		System.out.println(DivisibleBy5);
		
		if (DivisibleBy3 == true) {
			if (DivisibleBy5 == true) {
				return "FizzBuzz";
			}
			return "Fizz";
		} else if (DivisibleBy5 == true) {
			if (DivisibleBy3 == true) {
				return "FizzBuzz";
			}			
			return "Buzz";
		}
		
		return Value;
	}
	
	public static boolean CheckIfCorrect(String Before, String After) {
		String ConvertedString = (ConvertValue(Before));
		ConvertedString = ConvertedString.toLowerCase();
		After = After.toLowerCase();
		System.out.println("Correct Answer: "+ConvertedString);
		System.out.println("Their/Your Answer: "+After);
		
		if (ConvertedString.equalsIgnoreCase(After)) {
			System.out.println("CORRECT!");
			return true;
		}
		System.out.println("INCORRECT!");
		return false;
	}
	
	public static String ComputerTurn(String Value) {
		Random r = new Random();
		String NewValue = (ConvertValue(Value));
		
		int PercentOfCorrect = r.nextInt(101);
		
		if (PercentOfCorrect <= 20) {
			int AnswerStatus = r.nextInt(5);
			
			if (AnswerStatus == 1) {
				NewValue = Value;
			} else if (AnswerStatus == 2) {
				NewValue = "Fizz";
			} else if (AnswerStatus == 3) {
				NewValue = "Buzz";
			} else {
				NewValue = "FizzBuzz";
			}
		}
		
		JOptionPane.showMessageDialog(null, "My turn!");
		
		JOptionPane.showMessageDialog(null, "I call ["+NewValue+"]!");
		return NewValue;
	}
	
	public static int GetNextNumber(String Value) {
		int NextValue = Integer.parseInt(Value) + 1;
		return NextValue;
	}
	
	
}

