package dateTimeServer;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import dateTime.DateTimeClient;
import dateTime.DateTimeServer;

public class DateTimeServerImpl implements DateTimeServer {

	private Map< DateTimeClient,Integer> clients = new ConcurrentHashMap<DateTimeClient, Integer>();

	public void register(DateTimeClient client, int repeatInterval)
			throws RemoteException {
		clients.put(client,repeatInterval);
		System.out.println("Registered Client");
	}

	public void updateClients(int tick) {
		Date currentTime = new Date();

		for (Map.Entry<DateTimeClient, Integer> entry : clients.entrySet()) {
			
			DateTimeClient client = entry.getKey();
			try {
				Integer repeatTime = entry.getValue();
				if(tick%repeatTime==0){
					client.update(currentTime.toString());
				}
				
			} catch (RemoteException e) {
				clients.remove(client);
				e.printStackTrace();
			}
		}
	}
}
