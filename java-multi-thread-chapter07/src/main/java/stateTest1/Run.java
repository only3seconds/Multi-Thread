package stateTest1;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			MyThread t = new MyThread();
			System.out.println("main 方法中的状态1：" + t.getState());
			Thread.sleep(1000);
			t.start();
			Thread.sleep(1000);
			System.out.println("main 方法中的状态2：" + t.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
