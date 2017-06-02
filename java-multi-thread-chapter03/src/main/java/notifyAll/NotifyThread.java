package notifyAll;

public class NotifyThread extends Thread {
	private Object lock;
	
	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	public void run() {
		synchronized (lock) {
			lock.notifyAll();//唤醒所有线程
		}
	}
}
