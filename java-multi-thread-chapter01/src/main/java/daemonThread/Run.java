package daemonThread;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyThread thread =new MyThread();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(10000);
			System.out.println("我离开thread对象也不再打印了，也就是停止了！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}