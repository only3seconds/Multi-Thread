package innerTest1;

import innerTest1.OutClass.Inner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Inner inner = new Inner();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				inner.method1();
			}
		},"A");
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				inner.method2();
			}
		},"B");
		t1.start();
		t2.start();
		
	}

}
