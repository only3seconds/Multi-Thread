package s5;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThreadA a = new ThreadA();
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB();
			b.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
