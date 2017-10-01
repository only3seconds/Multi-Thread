package threadGroup_2;

public class MyThread extends Thread {
	
	private String num;
	public MyThread(ThreadGroup group, String name, String num) {
		super();
		this.num = num;
	}
	
	public void run() {
		int numInt = Integer.parseInt(num);
		while (this.isInterrupted() == false) {
			System.out.println("死循环中：" + Thread.currentThread().getName());
		}
	}

}
