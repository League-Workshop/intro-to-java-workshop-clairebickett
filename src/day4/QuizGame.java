package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int points = 0 ;
		// 2.  Ask the user a question 
		String score = JOptionPane.showInputDialog("What is the third color of the rainbow?");

		// 3.  Use an if statement to check if their answer is correct
		if (score.equals("Yellow")); 
		// 4.  if the user's answer is correct
		{speak("correct");
		// -- add one to their score 
		points ++ ; 
	
		}
		
			
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		score = JOptionPane.showInputDialog("What is the twenty first letter of the alphabet");
		if (score.equals("R")); 
		{ speak("correct"); }
			points ++ ; 
			score = JOptionPane.showInputDialog("What is at the beginning of everything always?");
			if (score.equals("the letter E"));
			speak("Correct");
			points ++ ; 
				
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " +words).waitFor();
		}
		catch ( Exception e) { 
			e.printStackTrace();
		}
	}
}
