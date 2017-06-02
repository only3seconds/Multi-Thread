package SetNewStringTwoLock;

public class ThreadA extends Thread {
	private MyService service;
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.testMethod();
	}
}
