package waitReleaseLock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.start();
		ThreadB b = new ThreadB(lock);
		b.start();
	} 

}
