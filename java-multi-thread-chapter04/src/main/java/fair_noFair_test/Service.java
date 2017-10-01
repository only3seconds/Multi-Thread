package fair_noFair_test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	
	private Lock lock;
	
	public Service(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);//构造公平锁和非公平锁
	}
	
	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName() + "获得锁定");
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}

}
