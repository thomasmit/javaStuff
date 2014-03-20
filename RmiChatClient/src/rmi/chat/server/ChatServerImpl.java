package rmi.chat.server;

import java.rmi.RemoteException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import rmi.client.chat.service.RMIChatClient;



public class ChatServerImpl implements ChatServer {

	private Map<RMIChatClient, String> clients = new ConcurrentHashMap<RMIChatClient, String>();

	public void register(RMIChatClient client, String name) {
		clients.put(client, name);
		System.out.println("Registered Client" + name);
	}



	@Override
	public void sendMessage(String message) throws RemoteException {
		for (Map.Entry<RMIChatClient, String> entry : clients.entrySet()) {

			RMIChatClient client = entry.getKey();
			String clientName = entry.getValue();
			try {				
				client.update(message);
			} catch (RemoteException e) {
				clients.remove(client);
				e.printStackTrace();
			}
		}
		
	}

	
}
