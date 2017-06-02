package synchronizedBlockLockAll_1;

public class Run_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(service,object);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(service,object);
		b.setName("b");
		b.start();

	}

}
