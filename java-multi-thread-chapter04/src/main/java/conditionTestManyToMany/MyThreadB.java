package conditionTestManyToMany;

public class MyThreadB extends Thread {
	
	private MyService service;
	
	public MyThreadB(MyService service) {
		super();
		this.service = service;
	}
	
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			service.get();
		}
	}

}

