package firstNotify;

public class MyRun {
	private String lock = new String("");
	private boolean isFirstRunB = false;
	private Runnable runnableA = new Runnable() {
		public void run() {
			// TODO Auto-generated method stub
			try {
				while (isFirstRunB == false) {
					synchronized (lock) {
						System.out.println("begin wait()");
						lock.wait();
						System.out.println("end wait()");
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	};
	private Runnable runnableB = new Runnable() {
		public void run() {
			// TODO Auto-generated method stub
			synchronized (lock) {
				System.out.println("begin notify()");
				lock.notify();
				System.out.println("end notify()");
				isFirstRunB = true;
			}
		}
		
	};

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyRun run = new MyRun();
		Thread a = new Thread(run.runnableA);
		a.start();
		Thread.sleep(100);
		Thread b = new Thread(run.runnableB);
		b.start();
		
	}

}
