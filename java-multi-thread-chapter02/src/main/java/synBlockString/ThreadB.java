package synBlockString;

public class ThreadB extends Thread {
	private Service service;
	
	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		super.run();
		service.setUsernamePassword("b","bb");
	}
}