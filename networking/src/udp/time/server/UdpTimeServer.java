package udp.time.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;

public class UdpTimeServer {
	public static void main(String[] args) throws IOException, InterruptedException{
		DatagramSocket socket = null;

		while(true){
			String date = (new Date()).toString();
			InetAddress address = InetAddress. getByName("localhost");
			DatagramPacket packet = new DatagramPacket(date.getBytes(), date.length(),address, 9090);
			socket = new DatagramSocket();
			socket.send(packet);
			Thread.sleep(3000);
		}
	}
}
