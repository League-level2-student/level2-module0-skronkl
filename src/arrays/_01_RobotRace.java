package arrays;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	public static void main(String[] args) {
		Robot[] robots = new Robot[5];

		for(int i = 0; i < 5; i++) {
			robots[i] = new Robot();
			robots[i].setSpeed(30);
			robots[i].setX(0);
			robots[i].setY(i * 100 + 100);
			robots[i].setAngle(90);
		}

		while(robots[0].getX() < 850 || robots[1].getX() < 850 || robots[2].getX() < 850 || robots[3].getX() < 850 || robots[4].getX() < 850) {
			
			for(int i = 0; i < 5; i++) {
				robots[i].move( (int) Math.round(Math.random() * 50 + 5));
				if(robots[i].getX() >= 850) {
					JOptionPane.showMessageDialog(null, "Robot " + (i + 1) + " wins!!");
				}
			}
		}

	}
	//1. make a main method

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
