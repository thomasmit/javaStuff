package com.ericsson.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Driver {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(com.ericsson.slf4j.Driver.class);

		logger.debug("debug message");
		logger.error("error message");
		logger.trace("trace message");
	}
}
