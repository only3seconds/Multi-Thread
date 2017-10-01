package threadGroup_1;

public class MyThread extends Thread {
	
	private String num;
	private String name;
	
	public MyThread(ThreadGroup group, String name, String num) {
		super();
		this.num = num;
		this.name = name;
	}
	
	public void run() {
		int numInt = Integer.parseInt(num);
		while (true) {
			System.out.println("死循环中：" + name);
		}
	}

}
