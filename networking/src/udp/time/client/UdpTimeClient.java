package udp.time.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpTimeClient {

	public static void main(String[] args) {
		try {
			String message = null;
			DatagramSocket socket = new DatagramSocket(9090);
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
			System.out.println("Waiting for UDP messages");
			while(true){
				socket.receive(packet);
				message = new String(packet.getData(), 0, packet.getLength());
				System.out.println(message);
			}
		
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
