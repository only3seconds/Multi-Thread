package synTwoLock;

public class ThreadB extends Thread {
	private Service service;
	
	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.printB();
	}
}
