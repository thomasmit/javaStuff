package dateTimeServer.Main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import dateTime.DateTimeServer;
import dateTimeServer.DateTimeServerImpl;

public class DateTimeServerDriver {

	public static void main(String[] args) {
		DateTimeServerImpl service = new DateTimeServerImpl();
		try {
			DateTimeServer stub = (DateTimeServer) UnicastRemoteObject
					.exportObject(service, 0);
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.rebind("dateTimeServer", stub);
			System.out.println("Date Time Server Ready");
			int tick = 0;
			while (true) {
				try {
					service.updateClients(tick++);
					Thread.sleep(1000);
				} catch (InterruptedException e) {	e.printStackTrace(); }
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
