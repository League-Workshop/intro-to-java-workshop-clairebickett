package day2;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot trash = new Robot(); 


        // 3. Put the robot's pen down
for(int i = 0; i < 4; i++)
	trash.penDown();


        // 6. Make the robot move as fast as possible
trash.setSpeed(1000);
trash.move(200);
    }

        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right

    	
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
    
}
