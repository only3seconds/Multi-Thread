package conditionTestMoreMethod;

public class ThreadA extends Thread {
	
	private MyService service = new MyService();
	
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.methodA();
	}

}
