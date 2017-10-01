package stateTest3;

public class MyThread2 extends Thread {
	
	public void run() {
		MyService.serviceMethod();
	}

}
