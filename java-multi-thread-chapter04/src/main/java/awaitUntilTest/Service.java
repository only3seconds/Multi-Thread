package awaitUntilTest;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void waitMethod() {
		try {
			Calendar calendarRef = Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);//设置时间为10秒
			lock.lock();
			System.out.println("  wait begin timer = " + System.currentTimeMillis());
			condition.awaitUntil(calendarRef.getTime());//10秒内无人唤醒，则自动唤醒自己
			System.out.println("  wait   end timer = " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void notifyMethod() {
		try {
			Calendar calendarRef = Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println("notify begin timer = " + System.currentTimeMillis());
			condition.signalAll();
			System.out.println("notify   end timer = " + System.currentTimeMillis());
		} finally {
			// TODO: handle finally clause
			lock.unlock();
		}
	}

}
