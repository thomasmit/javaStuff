package dateTime;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DateTimeClient extends Remote{
	void update (String dateTime) throws RemoteException;
}
