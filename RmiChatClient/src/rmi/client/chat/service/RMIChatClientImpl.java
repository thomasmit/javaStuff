package rmi.client.chat.service;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmi.chat.server.ChatServer;
import client.chat.ChatClient;
import client.chat.ChatService;
import client.chat.ChatServiceException;


public class RMIChatClientImpl implements ChatService, RMIChatClient {

	private ChatServer server;
	private ChatClient client;

	public RMIChatClientImpl(ChatClient client, String name) {
		this.client = client;
		try {
			RMIChatClient stub = (RMIChatClient) UnicastRemoteObject
					.exportObject(this, 0);
			Registry registry = LocateRegistry.getRegistry();
			server = (ChatServer) registry.lookup("chatServer");
			server.register(stub, name);
			System.out.println("Registered with Server");
		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
			throw new ChatServiceException("comms failure");
		}
	}


	@Override
	public void sendMessage(String message) throws ChatServiceException {
		try {
			server.sendMessage(message);
		} catch (RemoteException e) {
			e.printStackTrace();
			throw new ChatServiceException("comms failure");
		}
	}

	@Override
	public void update(String message) throws ChatServiceException {
		client.update(message);
	}

}
