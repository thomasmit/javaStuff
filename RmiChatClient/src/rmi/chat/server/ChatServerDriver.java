package rmi.chat.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;



public class ChatServerDriver {

	public static void main(String[] args) {
		ChatServerImpl service = new ChatServerImpl();
		try {
			ChatServer stub = (ChatServer) UnicastRemoteObject.exportObject(
					service, 0);
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("chatServer", stub);
			System.out.println("Chat Server Ready");

		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
