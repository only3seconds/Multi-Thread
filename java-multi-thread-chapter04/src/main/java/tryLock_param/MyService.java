package tryLock_param;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	
	public ReentrantLock lock = new ReentrantLock();
	
	public void waitMethod() {
		try {
			if (lock.tryLock(3, TimeUnit.SECONDS)) {
				System.out.println(" 	 " + Thread.currentThread().getName()
						+ "获得锁的时间：" + System.currentTimeMillis());
				Thread.sleep(10000);//持锁10秒钟，使得其他线程没有获得此锁
			} else {
				System.out.println(" 	 " + Thread.currentThread().getName()
						+ "没有获得锁");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}
