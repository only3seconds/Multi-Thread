package p_c_allWatit;

public class P {
	
	private String lock;
	
	public P(String lock){
		super();
		this.lock = lock;
	}
	
	public void setValue() {
		try {
			synchronized (lock) {
				while(!ValueObject.value.equals("")) {
					System.out.println("生产者 "
							+ Thread.currentThread().getName() + " WAITING");
					lock.wait();
				}
				System.out.println("生产者 "
						+ Thread.currentThread().getName() + " Runnable");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();//生产数据
				ValueObject.value = value;
				lock.notifyAll();//如果是notify(),每次只能唤醒一个线程，可能唤醒同类，引起整个项目的假死
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
