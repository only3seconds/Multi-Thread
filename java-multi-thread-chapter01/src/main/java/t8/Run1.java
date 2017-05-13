package t8;

public class Run1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mythread = new MyThread1();
		System.out.println("begin ="+System.currentTimeMillis());
		mythread.run();
		System.out.println("end ="+System.currentTimeMillis());

	}

}
