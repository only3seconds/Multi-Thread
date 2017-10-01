package synTwoLock;

public class ThreadA extends Thread {

	public void run() {
		Service.printA(); //printA()为 static 方法，可以直接由类名获得
	}
}
