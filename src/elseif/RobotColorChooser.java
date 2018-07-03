//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Random r = new Random();
		//1. Create a new Robot
		Robot robot = new Robot("mini"); 
		//3. Ask the user what color they would like the robot to draw
		robot.penDown();
		robot.setPenWidth(10);
		robot.setSpeed(10000000);
		for (int i=1;i<i+1;i++) {
			String UserColor = JOptionPane.showInputDialog("Pick a color");
			//5. Use an if/else statement to set the pen color that the user requested
			if (UserColor.equalsIgnoreCase("orange")) {
				robot.setPenColor(Color.orange);
			}else if (UserColor.equalsIgnoreCase("cyan")){
				robot.setPenColor(Color.cyan);
			}else if (UserColor.equalsIgnoreCase("gray")){
				robot.setPenColor(Color.gray);
			}else if (UserColor.equalsIgnoreCase("green")){
				robot.setPenColor(Color.green);
			}else if (UserColor.equalsIgnoreCase("red")){
				robot.setPenColor(Color.red);
			}else if (UserColor.equalsIgnoreCase("yellow")){
				robot.setPenColor(Color.yellow);
			}else if (UserColor.equalsIgnoreCase("pink")){
				robot.setPenColor(Color.pink);
			}else if (UserColor.equalsIgnoreCase("magenta")){
				robot.setPenColor(Color.magenta);
			}else if (UserColor.equalsIgnoreCase("blue")){
				JOptionPane.showMessageDialog(null, "[Color Not Found. Default Color: Black] ");
				robot.setRandomPenColor();
			}
	        //6. If the user doesn’t enter anything, choose a random color
			int RandomSides = r.nextInt(7)+2;
			int DegreesToTurn = 360/RandomSides;
	        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
			for (int w=1;w<=RandomSides;w++) {
				robot.move(50);
				robot.turn(DegreesToTurn);
			}
			//4. Set the pen width to 10
			
		    //2. Make the robot draw a shape (this will take more than one line of code)
		}

	}
}
