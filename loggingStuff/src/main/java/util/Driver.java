package main.java.util;

import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;



import com.ericsson.Demo;


public class Driver {

	public static void main(String[] args) throws InterruptedException {

		 try {
			   ClassLoader cl = Driver.class.getClassLoader();
			   InputStream configFile = cl.getResourceAsStream("logging.properties");
			   LogManager.getLogManager().readConfiguration(configFile);
			  } catch (Exception ex) {
			   ex.printStackTrace();
						
		}
		
		

		
		Logger logger = Logger.getLogger("main.java.util.Driver");

			
		
		logger.severe("Severe message for logger");
		logger.warning("Warning message for logger");
		logger.info("Info message for logger");
		logger.config("Config message for logger");
		logger.fine("Fine message for logger");
		logger.finer("Finer message for logger");
		logger.finest("Finest message for logger");

		Demo demo = new Demo();
		demo.m1();
	
	}

}
