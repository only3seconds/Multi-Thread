package useReturnInterrupt;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread t= new MyThread();
		t.start();
		Thread.sleep(2000);
		t.interrupt();
	}

}
