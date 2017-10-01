package stateTest4;

public class MyThread extends Thread {
	
	public void run() {
		try {
			synchronized (Lock.lock) {
				Lock.lock.wait();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
