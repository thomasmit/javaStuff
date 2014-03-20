package simple.wait.notify;

public class Reader implements Runnable {

	private Buffer buffer;
	
	public Reader(Buffer buffer){
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		String data = null;
		while(!("end".equals(data))){
			data = buffer.getData();
			System.out.println("Read: "+data);
		}
		System.out.println("consumer ending");
	}

}
