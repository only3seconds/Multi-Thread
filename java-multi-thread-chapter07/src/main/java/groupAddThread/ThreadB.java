package groupAddThread;

public class ThreadB extends Thread {
	
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			try {
				System.out.println("ThreadName = " + Thread.currentThread().getName());
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
