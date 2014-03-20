package rmi.client.chat.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIChatClient extends Remote {
	void update(String message) throws RemoteException;
}
