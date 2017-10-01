package threadExceptionMove;

public class Run1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread myThread = new MyThread();
		//对象
		myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		//类
	    MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		
		myThread.start();
	}

}
