package waitOld;

public class ThreadSubtract extends Thread {
	private Subtract substract;
	
	public ThreadSubtract(Subtract substract) {
		super();
		this.substract = substract;
	}
	
	public void run() {
		substract.subtract();
	}
}
