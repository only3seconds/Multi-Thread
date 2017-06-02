package synStaticMethod;

public class ThreadB extends Thread {
	public void run() {
		Service.printB();
	}
}
