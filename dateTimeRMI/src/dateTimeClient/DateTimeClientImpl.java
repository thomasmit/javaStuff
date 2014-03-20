package dateTimeClient;

import java.rmi.RemoteException;

import dateTime.DateTimeClient;

public class DateTimeClientImpl implements DateTimeClient {

	@Override
	public void update(String dateTime) throws RemoteException {
		System.out.println("date and time is : " + dateTime);

	}

}
