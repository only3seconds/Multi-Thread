package join_sleep_1;

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
