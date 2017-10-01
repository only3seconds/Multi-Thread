package stateTest2;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			MyThread t = new MyThread();
			t.start();
			Thread.sleep(1000);
			System.out.println("main 方法中的状态： " + t.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
