package day2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot susan = new Robot(); 
	void go() {
		// 4. Make the robot move as fast as possible
susan.setSpeed(1000);
		// 5. Set the pen width to 5
susan.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
for(int i = 0; i < 4; i++) {
susan.setRandomPenColor();

			// 1. Call the drawSquare() method
	drawSquare(); 
			// 8. Turn the robot 90 degrees to the right

	susan.turn(90);}}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for(int i = 0; i < 4; i++) {
			susan.setRandomPenColor();
			susan.penDown();
			susan.move(200);
		    susan.turn(90);} 
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



