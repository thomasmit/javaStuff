package com.ericsson.robot;

public class RobotData {

	private String robotName;
	private int x;
	private int y;

	public String getRobotName() {
		return robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public RobotData(String robotName, int x, int y) {
		super();
		this.robotName = robotName;
		this.x = x;
		this.y = y;
	}
}
