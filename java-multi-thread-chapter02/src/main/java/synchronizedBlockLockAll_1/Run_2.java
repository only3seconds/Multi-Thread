package synchronizedBlockLockAll_1;

public class Run_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		MyObject object1 = new MyObject();
		MyObject object2 = new MyObject();
		ThreadA a = new ThreadA(service,object1);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(service,object2);
		b.setName("b");
		b.start();

	}

}
