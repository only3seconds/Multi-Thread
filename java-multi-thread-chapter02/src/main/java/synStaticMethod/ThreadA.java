package synStaticMethod;

public class ThreadA extends Thread {
	public void run() {
		Service.printA();
	}
}
