package com.ericsson.robot;

import java.util.Observable;

public class SimpleRobot extends Observable implements Robot{
	
	String robotName;
	
	public SimpleRobot(String robotName){
		this.robotName = robotName;
	}
	
	public String getRobotName() {
		return robotName;
	}

	@Override
	public void move(int x, int y) {		
		System.out.println("Robot: " + robotName + " is moving the x distance " + x + " and the y distance " + y);
		RobotData rData = new RobotData(robotName, x, y);
		setChanged();
		notifyObservers(rData);
	}

}
