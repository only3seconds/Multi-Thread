package synchronizedMethodLockObject;

public class MyObject {
	synchronized public void methodA(){
		try {
			System.out.println("beign methodA threadName = "+Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
