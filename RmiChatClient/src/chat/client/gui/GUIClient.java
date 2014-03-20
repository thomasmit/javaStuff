package chat.client.gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.apache.log4j.Logger;

import client.chat.ChatClient;
import client.chat.ChatService;
import client.chat.service.factory.ChatServiceFactory;
import client.chat.service.factory.LoggerFactory;

public class GUIClient extends JFrame implements ChatClient {
	
	
	Logger logger = LoggerFactory.getLogger();

	
	private static final long serialVersionUID = 1L;
	private JTextArea messages = new JTextArea();
	protected JTextArea textArea;
	private ChatService chatService;

	public GUIClient() {
		chatService = ChatServiceFactory.createChatService(this, "name");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void update(String message) {
		messages.append(message + "\n");
		logger.info("GUI message is " + message);
	}

	void start() {
		setTitle("ChatClient");
		JScrollPane pane = new JScrollPane(messages);
		add(pane);
		setSize(300, 200);
		setVisible(true);
	}

}
