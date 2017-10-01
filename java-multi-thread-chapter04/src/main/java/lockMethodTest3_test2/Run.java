package lockMethodTest3_test2;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Service service = new Service(true);
		Runnable runnable = new Runnable() {
			public void run() {
				service.serviceMethod();
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
