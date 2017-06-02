package joinException;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ThreadB b = new ThreadB();
			b.start();
			
			ThreadB.sleep(500);
			
			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
