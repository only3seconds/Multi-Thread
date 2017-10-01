package synMoreObjectStaticOneLock;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Service service1 = new Service();
		Service service2 = new Service();
		ThreadA a = new ThreadA(service1); //虽然是不同的对象，但静态的同步方法还是同步
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service2);
		b.setName("B");
		b.start();

	}

}
