package com.builderdesignpatternexample;

public class Robot implements RobotPlan{
	
	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;




	@Override
	public void setRobotHead(String head) {
		robotHead = head;
		
	}
	
	public String getRobotHead() {
		return robotHead;
	}

	@Override
	public void setRobotTorso(String torso) {
		robotTorso = torso;
		
	}
	
	public String getRobotTorso() {
		return robotTorso;
	}

	@Override
	public void setRobotArm(String arms) {
		robotArms = arms;
		
	}
	
	public String getRobotArms() {
		return robotArms;
	}

	@Override
	public void setRobotLeg(String legs) {
		robotLegs = legs;
		
	}
	
	public String getRobotLegs() {
		return robotLegs;
	}

}
