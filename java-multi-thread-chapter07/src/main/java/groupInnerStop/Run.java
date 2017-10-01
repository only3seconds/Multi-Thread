package groupInnerStop;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ThreadGroup group = new ThreadGroup("My Group");
			for (int i = 0; i < 5; i++) {
				MyThread thread = new MyThread(group, "thread" + (i +1));
				thread.start();
			}
			Thread.sleep(5000);
			group.interrupt();
			System.out.println(" 调用了 interrupt() 方法");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(" 停了停了！");
			e.printStackTrace();
		}
	}

}
