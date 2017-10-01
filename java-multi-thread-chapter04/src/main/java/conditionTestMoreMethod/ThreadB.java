package conditionTestMoreMethod;

public class ThreadB extends Thread {
	
	private MyService service = new MyService();
	
	public ThreadB(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.methodB();
	}


}
