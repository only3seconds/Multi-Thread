package readWriteLockBegin3;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		Thread.sleep(1000);
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}

}
