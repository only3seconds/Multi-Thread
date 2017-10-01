package singleton_3;

public class MyThread extends Thread {
	
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
