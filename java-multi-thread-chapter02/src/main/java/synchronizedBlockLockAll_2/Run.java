package synchronizedBlockLockAll_2;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Service service = new Service();
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(service,object);
		a.setName("a");
		a.start();
		Thread.sleep(100);
		ThreadB b = new ThreadB(object);
		b.setName("b");
		b.start();

	}

}
