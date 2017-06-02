package synBlockString;

public class ThreadA extends Thread {
	private Service service;
	
	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		super.run();
		service.setUsernamePassword("a","aa");
	}
}
