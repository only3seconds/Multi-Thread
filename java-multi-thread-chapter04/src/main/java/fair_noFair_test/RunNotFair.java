package fair_noFair_test;

public class RunNotFair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Service service = new Service(false);
		Runnable runnable = new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("*线程" + Thread.currentThread().getName()
						+ "运行了");
				service.serviceMethod();
			}
		};

		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}
	}

}
