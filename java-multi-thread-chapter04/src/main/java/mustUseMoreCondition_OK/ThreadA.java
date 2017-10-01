package mustUseMoreCondition_OK;

public class ThreadA extends Thread {

	private MyService service;
	
	public ThreadA(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.awaitA();
	}
}
