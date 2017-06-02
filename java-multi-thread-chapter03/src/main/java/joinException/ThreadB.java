package joinException;

public class ThreadB extends Thread {

	public void run() {
		try {
			ThreadA a = new ThreadA();
			a.start();
			a.join();
			System.out.println("线程B在run end处打印了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("线程B在catch处打印了");
			e.printStackTrace();
		}
	}
}
