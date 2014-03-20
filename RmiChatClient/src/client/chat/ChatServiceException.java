package client.chat;

import org.apache.log4j.Logger;

import client.chat.service.factory.LoggerFactory;

public class ChatServiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	Logger logger = LoggerFactory.getLogger();

	public ChatServiceException(String error) {
		super(error);
		logger.error(error);
	}
}
