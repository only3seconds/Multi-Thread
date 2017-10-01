package threadExceptionMove;

public class MyThreadGroup extends ThreadGroup {

	public MyThreadGroup(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void uncaughtExceptionHandler(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		System.out.println("线程组的异常处理");
		e.printStackTrace();
	}
	
}
