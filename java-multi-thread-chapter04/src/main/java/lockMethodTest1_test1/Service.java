package lockMethodTest1_test1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	
	private ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod1() {
		try {
			lock.lock();
			System.out.println("serviceMethod1 getHoldCount=" + lock.getHoldCount());
			serviceMethod2();
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}

	private void serviceMethod2() {
		try {
			lock.lock();
			System.out.println("serviceMethod2 getHoldCount=" + lock.getHoldCount());
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
		
	}

}
