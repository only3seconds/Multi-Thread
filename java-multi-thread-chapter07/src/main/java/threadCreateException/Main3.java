package threadCreateException;

import java.lang.Thread.UncaughtExceptionHandler;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {

			public void uncaughtException(Thread t, Throwable e) {
				// TODO Auto-generated method stub
				System.out.println("线程：" + t.getName() + "出现了异常： ");
				e.printStackTrace();
			}
		});

		MyThread t1 = new MyThread();
		t1.setName("线程t1");
		t1.start();
		MyThread t2 = new MyThread();
		t2.setName("线程t2");
		t2.start();
	}

}
