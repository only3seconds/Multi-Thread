package waitOld;
//加法
public class Add {
	private String lock;
	
	public Add(String lock) {
		super();
		this.lock = lock;
	}
	
	public void add() {
		synchronized (lock) {
			System.out.println("notify begin ThreadName = "
					+ Thread.currentThread().getName());
			ValueObject.list.add("anyString");
			lock.notifyAll();
			System.out.println("notify begin ThreadName = "
					+ Thread.currentThread().getName());
		}
	}
}
