package threadGroup_2;

public class MyThreadGroup extends ThreadGroup {

	public MyThreadGroup(String name) {
		super(name);
	}
	
	public void unCaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		this.interrupt();
	}

}
