package t99;

public class PrintStirng {
	private boolean isContinuePrint = true;
	public boolean isContinuePrint() {
		return isContinuePrint;
	}
	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}
	
	public void printStringMethod() {
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
}
