package synchronizedBlockLockAll_2;

public class Service {
	public void testMethod1(MyObject object) {
		try {
			synchronized (object) {
				System.out.println("testMethod1__getLock time="
						+ System.currentTimeMillis() + "run ThreadName="
						+ Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println("testMethod1__releaseLock time="
						+ System.currentTimeMillis() + "run ThreadName="
						+ Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
