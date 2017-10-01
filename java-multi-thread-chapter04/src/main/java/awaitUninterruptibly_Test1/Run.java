package awaitUninterruptibly_Test1;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Service service = new Service();
			MyThread myThread = new MyThread(service);
			myThread.start();
			Thread.sleep(3000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
