package awaitUninterruptibly_Test2;

public class MyThread extends Thread {

	private Service service;
	
	public MyThread(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.testMethod();
	}
}
