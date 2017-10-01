package tryLock_param;

public class Run2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		final MyService service = new MyService();
		Runnable runnableRef = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName()
						+ "调用 waitMethod 时间： " + System.currentTimeMillis());
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
