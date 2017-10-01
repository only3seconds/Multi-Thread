package threadExceptionMove;

import java.lang.Thread.UncaughtExceptionHandler;

public class ObjectUncaughtExceptionHandler implements UncaughtExceptionHandler {

	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("对象的异常处理");
		e.printStackTrace();
	}
}
