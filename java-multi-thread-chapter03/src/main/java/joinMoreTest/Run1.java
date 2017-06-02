package joinMoreTest;

public class Run1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(2000);
			System.out.println("    main end "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
