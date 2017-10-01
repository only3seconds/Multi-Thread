package lockMethodTest1_test2;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	
	public ReentrantLock lock = new ReentrantLock();//public方便Service对象获取此锁
	
	public void serviceMehod1() {
		try {
			lock.lock();
			System.out.println("ThreadNme=" + Thread.currentThread().getName()
					+ "进入方法！ ");
			Thread.sleep(Integer.MAX_VALUE);//无限sleep,并且sleep方法不释放锁
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
