package readWriteLockBegin2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
	
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void write() {
		try {
			try {
				lock.writeLock().lock();
				System.out.println("获得写锁" + Thread.currentThread().getName()
						+ " " + System.currentTimeMillis());
				Thread.sleep(10000);
			} finally {
				// TODO: handle finally clause
				lock.writeLock().unlock();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
