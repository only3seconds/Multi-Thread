package waitInterruptException;

public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				lock.wait();
				System.out.println("end wait()");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("出现异常了，因为呈wait状态的线程被interrupt了");
		}
	}
}
