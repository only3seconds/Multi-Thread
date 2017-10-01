package synTwoLock;

public class ThreadC extends Thread {
	
	private Service service;
	
	public ThreadC(Service service) {
		super();
		this.service = service;
	}
	
	public void run() {
		service.printC(); //printC() 为 非static 方法，不能直接由类名获得，需要借助类的对象
	}
}
