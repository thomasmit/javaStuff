package com.ericsson.robot;

import java.util.ArrayList;
import java.util.List;

public class RobotGroup implements Robot{
	
	private List<Robot> children = new ArrayList<>();
	
	public void add(Robot robot) {
		children.add(robot);
	}
	
	public void remove(Robot robot) {
		children.remove(robot);
	}

	@Override
	public void move(int x, int y) {
		for (Robot robot : children){
			robot.move(x, y);
		}
		
	}
	
	

}
