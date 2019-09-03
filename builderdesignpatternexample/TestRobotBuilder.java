package com.builderdesignpatternexample;

public class TestRobotBuilder {
	
	public static void main(String[] args) {
		//specifying what type of robot we want build
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		//telling the engineer what type of robot we want to be build
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		
		robotEngineer.makeRobot();
		
		Robot firstRobot = robotEngineer.getRobot();
		
		System.out.println("Robot Built");
		
		System.out.println("Robot Head type: "+ firstRobot.getRobotHead());
		
		System.out.println("Robot Torso type: "+ firstRobot.getRobotTorso());
		
		System.out.println("Robot Arms type: "+ firstRobot.getRobotArms());
		
		System.out.println("Robot Legs type: "+ firstRobot.getRobotLegs());
	}

}
