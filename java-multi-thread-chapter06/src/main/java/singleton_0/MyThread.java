package singleton_0;

public class MyThread extends Thread {
	
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
