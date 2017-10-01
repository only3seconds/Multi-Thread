package threadExceptionMove;

import java.lang.Thread.UncaughtExceptionHandler;

public class StateUncaughtExceptionHandler implements UncaughtExceptionHandler {

	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("静态的异常处理");
		e.printStackTrace();
		
	}

}
