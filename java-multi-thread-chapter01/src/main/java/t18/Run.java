package t18;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread begin prority="+Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(6);
		System.out.println("main thread end prority="+Thread.currentThread().getPriority());
		MyThread1 thread1=new MyThread1();
		thread1.start();

	}

}
