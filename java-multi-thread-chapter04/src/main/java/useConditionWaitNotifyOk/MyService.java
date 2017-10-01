package useConditionWaitNotifyOk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	
	private Lock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	
	public void aawait() {
		try {
			lock.lock();
			System.out.println(" await 时间为 " + System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signal() {
		try {
			lock.lock();
			System.out.println(" signal 时间为 " + System.currentTimeMillis());
			condition.signal();
		} finally {
			lock.unlock();
		}
	}

}
