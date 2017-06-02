package t10;

public class PrintStirng implements Runnable {
	volatile public static boolean isContinuePrint = true;
	
	public static boolean isContinuePrint() {
		return isContinuePrint;
	}
	
	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}
	
	synchronized public static void printStringMethod() {
		try {
			while (isContinuePrint == true) {
				System.out.println("run printStirngMethod threadName = "
						+ Thread.currentThread().getName());
				Thread.sleep(1000);
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run() {
		// TODO Auto-generated method stub
		printStringMethod();
	}
}
