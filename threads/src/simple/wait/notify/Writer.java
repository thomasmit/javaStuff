package simple.wait.notify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Writer implements Runnable {

	private Buffer buffer;
	
	public Writer(Buffer buffer){
		this.buffer = buffer;
	}
	

	@Override
	public void run() {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(is);

		String line = null;
		try {
			while(!"end".equals(line)){
				System.out.println("Enter some text: ");
				line = reader.readLine();
				buffer.addMessage(line);
			}
			System.out.println("Producer ending");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
