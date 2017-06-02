package twoStop;

public class ThreadA extends Thread {
	private Service service;
	public ThreadA(Service service) {
		super();
		this.service = new Service();
	}
	public void run() {
		service.methodA();
	}
}
