package waitHasParamMethod;

public class MyRunnable {
	
	static private Object lock = new Object();
	static private Runnable runnable1  = new Runnable() {
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("wait begin timer = "
							+System.currentTimeMillis());
					lock.wait(5000);//5000毫秒内若无线程唤醒，则自动唤醒
					System.out.println("wait end timer = "
							+System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	static private Runnable runnable2  = new Runnable() {
		public void run() {
			synchronized (lock) {
				System.out.println("notify begin timer = "
						+System.currentTimeMillis());
				lock.notify();
				System.out.println("notify end timer = "
						+System.currentTimeMillis());
			}
		}
	};
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(runnable1);
		t1.start();
		Thread.sleep(3000);
		Thread t2 = new Thread(runnable2);
		t2.start();
	}

}
