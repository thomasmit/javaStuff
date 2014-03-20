package dateTime;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DateTimeServer extends Remote {
	void register(DateTimeClient client, int repeatInterval) throws RemoteException;
}
