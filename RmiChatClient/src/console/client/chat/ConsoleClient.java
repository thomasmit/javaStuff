package console.client.chat;

import java.util.Scanner;

import org.apache.log4j.Logger;

import client.chat.ChatClient;
import client.chat.ChatService;
import client.chat.service.factory.ChatServiceFactory;
import client.chat.service.factory.LoggerFactory;

public class ConsoleClient implements ChatClient {
	
	Logger logger = LoggerFactory.getLogger();

	private ChatService chatService;

	public ConsoleClient() {
		chatService = ChatServiceFactory.createChatService(this, "name");
	}

	@Override
	public void update(String message) {
		System.out.println(message);

	}

	public void start() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your name\n");
		String name = keyboard.nextLine();
		chatService.sendMessage(" ClientName: " + name);

		logger.info("client name is: "+name);
		String message = "";

		while (!message.equalsIgnoreCase("exit")) {
			System.out.println(">");
			message = keyboard.nextLine();
			chatService.sendMessage(name + " says-> " + message);
			logger.info("client "+name + " message is "  + message);
		}
	}
}
