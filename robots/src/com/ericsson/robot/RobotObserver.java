package com.ericsson.robot;

import java.util.Observable;
import java.util.Observer;

public class RobotObserver implements Observer{

	@Override
	public void update(Observable robot, Object rData) {
		RobotData robotData = (RobotData) rData;
		System.out.println("I have heard that robot: " + robotData.getRobotName() + " has moved the x distance: " + robotData.getX() + " and the y distance" + robotData.getY());
	}

}
