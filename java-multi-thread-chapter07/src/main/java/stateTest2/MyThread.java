package stateTest2;

public class MyThread extends Thread {
	
	public void run() {
		try {
			System.out.println("begin sleep");
			Thread.sleep(10000);
			System.out.println("end   sleep");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
