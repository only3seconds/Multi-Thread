package synLockIn_2;

public class MyThread extends Thread{
	public void run(){
		Sub sub = new Sub();
		sub.operateISubMethod();
	}

}
