package com.ericsson;

import java.util.logging.Logger;

public class Demo {
	static Logger logger = Logger.getLogger("com.ericsson");
	
	public void m1(){
		logger.finest("finest message");
		logger.config("config message");
		logger.severe("severe message");
		
	}

}
