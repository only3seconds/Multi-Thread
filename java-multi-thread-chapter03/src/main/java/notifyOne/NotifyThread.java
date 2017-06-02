package notifyOne;

public class NotifyThread extends Thread {
	private Object lock;
	
	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	public void run() {
		synchronized (lock) {
			lock.notify();//随机唤醒一个线程
		}
	}
}
