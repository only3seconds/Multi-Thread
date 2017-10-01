package awaitUntilTest;

public class Run2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Service service = new Service();
		MyThreadA myThreadA = new MyThreadA(service);
		myThreadA.start();//myThreadA 2秒 后被 myThreadB 唤醒
		Thread.sleep(2000);
		MyThreadB myThreadB = new MyThreadB(service);
		myThreadB.start();
	}

}

