package com.builderdesignpatternexample;

public class RobotEngineer {
	//defines factory type
	
	private RobotBuilder robotBuilder;
	
	public RobotEngineer(RobotBuilder robotBuilder) {
		
		this.robotBuilder = robotBuilder;
		
	}
	
	public Robot getRobot() {
		
		return this.robotBuilder.getRobot();
		
	}
	
	public void makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}
}
