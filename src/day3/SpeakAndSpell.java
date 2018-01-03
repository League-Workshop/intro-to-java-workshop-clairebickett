package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell Banana");
		// 2. Catch the user's answer in a String
String word = JOptionPane.showInputDialog("Type the Word!");
		// 3. If the user spelled the word correctly, speak "correct"
if ( word.equals("Banana") ) 
speak("correct");
		// 4. Otherwise say "wrong"
else
speak("Wrong");
		// 5. repeat the process for other words
speak("spell potatoes");
		String word2 = JOptionPane.showInputDialog("Type the Word!");
				if( word2.equals("Potatoes"))
					speak("Correct");
				else
					speak("Wrong!");
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


