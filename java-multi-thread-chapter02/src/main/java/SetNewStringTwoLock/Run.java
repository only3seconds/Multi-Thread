package SetNewStringTwoLock;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		ThreadB b = new ThreadB(service);
		b.setName("B");
		a.start();
		Thread.sleep(50);//存在50毫秒，50毫秒后B取得的锁是"456"
		b.start();
	}	
}
