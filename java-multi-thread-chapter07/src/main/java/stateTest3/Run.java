package stateTest3;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1();
		t1.setName("a");
		t1.start();
		
		MyThread2 t2 = new MyThread2();
		t2.setName("b");
		t2.start();
		
		System.out.println("main 方法中 t1 状态 " + t1.getState());
	}

}
