package conditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	public void methodA() {
		try {
			lock.lock();
			System.out.println("ThreadA begin ThreadName ="
					+ Thread.currentThread().getName()
					+ " time=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("ThreadA end ThreadName ="
					+ Thread.currentThread().getName()
					+ " time=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void methodB() {
		try {
			lock.lock();
			System.out.println("ThreadB begin ThreadName ="
					+ Thread.currentThread().getName()
					+ " time=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("ThreadB end ThreadName ="
					+ Thread.currentThread().getName()
					+ " time=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}

}
