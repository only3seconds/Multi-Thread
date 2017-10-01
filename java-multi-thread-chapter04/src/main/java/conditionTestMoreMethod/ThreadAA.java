package conditionTestMoreMethod;

public class ThreadAA extends Thread {
	
	private MyService service = new MyService();
	
	public ThreadAA(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.methodA();
	}


}
