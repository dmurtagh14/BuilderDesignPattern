package com.builderdesignpatternexample;

public interface RobotPlan {
	
	//sets qualities we want ALL robots to have
	public void setRobotHead(String head);
	public void setRobotTorso(String torso);
	public void setRobotArm(String arms);
	public void setRobotLeg(String legs);
}
