package notifyHoldLock;

public class NotifyThread extends Thread {
 private Object lock;
	
	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	public void run() {
		Service service = new Service();
		service.synNotifyMethod(lock);;
	}
}
