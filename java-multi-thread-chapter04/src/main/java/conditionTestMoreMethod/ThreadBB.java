package conditionTestMoreMethod;

public class ThreadBB extends Thread {
	
	private MyService service = new MyService();
	
	public ThreadBB(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.methodB();
	}


}
