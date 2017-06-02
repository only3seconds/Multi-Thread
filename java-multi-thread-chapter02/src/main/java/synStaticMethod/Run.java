package synStaticMethod;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadA a = new ThreadA();
		a.setName("A");
		a.start();
		ThreadB b =new ThreadB();
		b.setName("B");
		b.start();
	}

}
