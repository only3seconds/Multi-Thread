package awaitUntilTest;

public class MyThreadB extends Thread {
	
	private Service service;
	
	public MyThreadB(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.notifyMethod();
	}
}
