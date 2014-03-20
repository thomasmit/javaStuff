package com.ericsson.robot;

public class Driver {

	public static void main(String[] args) {

		RobotObserver robotObserver = new RobotObserver();

		SimpleRobot r = new SimpleRobot("testRobot");
		r.addObserver(robotObserver);
		// r.move(12,50);

		// System.out.println("=================================");

		SimpleRobot r2 = new SimpleRobot("AnotherTestRobot");
		r2.addObserver(robotObserver);
		// r2.move(23,21);

		RobotGroup rGroup = new RobotGroup();
		rGroup.add(r);
		rGroup.add(r2);
		rGroup.move(12, 42);
	}

}
