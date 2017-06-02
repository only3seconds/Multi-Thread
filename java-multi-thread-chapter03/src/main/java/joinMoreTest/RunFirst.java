package joinMoreTest;

public class RunFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadB b = new ThreadB();
		ThreadA a = new ThreadA(b);
		a.start();
		b.start();
		System.out.println("    main end "
				+ System.currentTimeMillis());
	}

}
