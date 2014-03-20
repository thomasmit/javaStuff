package client.chat.service.factory;

import rmi.client.chat.service.RMIChatClientImpl;
import client.chat.ChatClient;
import client.chat.ChatService;

public class ChatServiceFactory {

	public static ChatService createChatService(ChatClient chatClient,
			String name) {
		return new RMIChatClientImpl(chatClient, name) ; 
	}

}
