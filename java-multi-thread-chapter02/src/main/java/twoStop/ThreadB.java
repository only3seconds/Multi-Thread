package twoStop;

public class ThreadB extends Thread {
	private Service service;
	public ThreadB(Service service) {
		super();
		this.service = new Service();
	}
	public void run() {
		service.methodB();
	}

}
