package com.builderdesignpatternexample;

public class OldRobotBuilder implements RobotBuilder{
	
	//everytime we want to make a new robot, just create
	//a new builder class to specify what you want components to be

	private Robot robot;
	
	//constructor of OldRobotBuilder
	public OldRobotBuilder() {
		this.robot = new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
		
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");

		
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotArm("Blow torch");

	}

	@Override
	public void buildRobotArms() {
		robot.setRobotLeg("Roller skates");
		
	}
	
	
	public Robot getRobot() {
		return this.robot;
	}
	

}
