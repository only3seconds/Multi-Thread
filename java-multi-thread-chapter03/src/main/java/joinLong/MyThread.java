package joinLong;

public class MyThread extends Thread {

	public void run() {
		try {
			System.out.println("begin Timer = " + System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
