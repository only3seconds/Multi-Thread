package waitOld;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String lock = new String("");//锁
	
		Add add = new Add(lock);
		Subtract substract =new Subtract(lock);
		
		ThreadSubtract substract1Thread = new ThreadSubtract(substract);
		substract1Thread.setName("substract1Thread");
		substract1Thread.start();
		
		ThreadSubtract substract2Thread = new ThreadSubtract(substract);
		substract2Thread.setName("substract2Thread");
		substract2Thread.start();
		
		Thread.sleep(1000);
		
		ThreadAdd addThread = new ThreadAdd(add);
		addThread.setName("addThread");
		addThread.start();
	}

}
