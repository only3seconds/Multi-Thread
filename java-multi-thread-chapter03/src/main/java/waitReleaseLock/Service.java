package waitReleaseLock;

public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait()");
				//Thread.sleep(4000);
				lock.wait();
				System.out.println("end wait()");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
