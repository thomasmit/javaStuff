package client.chat.service.factory;

import org.apache.log4j.Logger;

public class LoggerFactory {

	public static Logger getLogger() {
		return Logger
				.getLogger(client.chat.service.factory.LoggerFactory.class);
	}
}
