package rmi.chat.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import rmi.client.chat.service.RMIChatClient;

public interface ChatServer extends Remote {
	void register(RMIChatClient client, String name) throws RemoteException;
	void sendMessage (String message) throws RemoteException;
}
