package thread.exercise;

public class PrintNumbers implements Runnable {

	private int start, end, delay;
	
	public PrintNumbers(int start, int end, int delay) {
		this.start = start;
		this.end = end;
		this.delay = delay;
	}

	@Override
	public void run() {
		for(int i=start; i <= end; i++){
			System.out.format("%d%n", i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
