package simple.wait.notify;


public class Buffer {
	
	private StringBuffer data = new StringBuffer();
	
	public synchronized String getData(){
		String returnValue = null;
		try {
			wait();
			returnValue = data.toString();
			data = new StringBuffer();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
	

	public  void addMessage(String msg){
		synchronized(this){ 
			//this creates a synchronized block better practice then on method signature as whole method 
			//is blocked some of which does not need synchronization, synchronized blocks need the obj whose
			//flag you wish to change to be passed (i.e. this). 
		   this.data.append(msg);
		   notify();
		}
	}

}
