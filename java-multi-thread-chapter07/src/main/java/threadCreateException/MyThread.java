package threadCreateException;

public class MyThread extends Thread {
	
	public void run() {
		String username = null;
		System.out.println(username.hashCode());
	}

}
