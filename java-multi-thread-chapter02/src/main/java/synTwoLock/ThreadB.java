package synTwoLock;

public class ThreadB extends Thread {
	
	public void run() {
		Service.printB(); //printB() 为 static 方法，可以直接由类名获得
	}
}
