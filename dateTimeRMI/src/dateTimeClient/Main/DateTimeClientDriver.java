package dateTimeClient.Main;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import dateTime.DateTimeClient;
import dateTime.DateTimeServer;
import dateTimeClient.DateTimeClientImpl;

public class DateTimeClientDriver {

	public static void main(String[] args) {
		DateTimeClient client = new DateTimeClientImpl();
		try {
			//int repeatInterval = Integer.parseInt(args[0]);
			Integer repeatInterval = 2;
			DateTimeClient stub = (DateTimeClient) UnicastRemoteObject
					.exportObject(client, 0);
			Registry registry = LocateRegistry.getRegistry();
			DateTimeServer service = (DateTimeServer) registry
					.lookup("dateTimeServer");
			service.register(stub, repeatInterval);
			System.out.println("Client registered");
		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		}

	}

}
