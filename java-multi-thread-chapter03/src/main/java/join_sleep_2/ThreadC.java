package join_sleep_2;

public class ThreadC extends Thread {

	private ThreadB b;
	
	public ThreadC(ThreadB b) {
		super();
		this.b = b;
	}
	
	public void run() {
		b.bService();
	}
	
}
