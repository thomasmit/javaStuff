package main.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Driver {

	public static void main(String[] args) {
		final Logger logger = LoggerFactory.getLogger(main.slf4j.Driver.class);
		logger.debug("Debug Message");
		logger.error("Error Message");

		

		
		
	}

}
