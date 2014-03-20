package simple.wait.notify;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Reader reader = new Reader(buffer);
		Writer writer = new Writer(buffer);
		
		Thread readerThread = new Thread(reader, "reader");
		Thread writerThread = new Thread(writer, "writer");
		
		readerThread.start();
		writerThread.start();
		
		
	}

}
