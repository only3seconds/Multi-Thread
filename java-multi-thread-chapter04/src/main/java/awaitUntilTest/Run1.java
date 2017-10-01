package awaitUntilTest;

public class Run1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Service service = new Service();
		MyThreadA myThreadA = new MyThreadA(service);
		myThreadA.start();//myThreadA 10秒后自动唤醒自己了
	}

}
