package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {

		
		// START HERE
	System.out.println("Hello World!");
	Robot carl	= new Robot(); 
	carl.penDown();
	carl.setSpeed(100);
	for(int i = 0; i < 4; i++) {
	carl.setRandomPenColor();
	carl.move(200);
    carl.turn(90);} 
    carl.sparkle();
	}
}

