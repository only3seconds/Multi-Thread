package tryLockTest;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Service service = new Service();
		Runnable runnableRef = new Runnable() {
			public void run() {
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();

	}

}
