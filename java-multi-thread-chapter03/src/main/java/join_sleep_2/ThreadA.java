package join_sleep_2;

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
				b.join(6000);
				//join()释放锁！
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
