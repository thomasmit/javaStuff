package main.log4j;

import org.apache.log4j.Logger;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  	Logger logger = Logger.getLogger(main.log4j.Driver.class);
		  
			logger.debug("Debug message in Driver");
			logger.error("Error message in Driver");
			logger.fatal("Fatal message in Driver");
			logger.info("Info message in Driver");
			logger.trace("Trace message in Driver");
			logger.warn("Warn message in Driver");
	}

}
