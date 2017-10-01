package stateTest3;

public class MyThread1 extends Thread {
	
	public void run() {
		MyService.serviceMethod();
	}

}
