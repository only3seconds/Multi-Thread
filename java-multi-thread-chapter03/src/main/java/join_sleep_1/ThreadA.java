package join_sleep_1;

public class ThreadA extends Thread {

	private ThreadB b;
	
	public ThreadA(ThreadB b) {
		super();
		this.b = b;
	}
	
	public void run() {
		try {
			synchronized (b) {
				b.start();
				Thread.sleep(6000);
				//Thread.sleep()不释放锁！
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
