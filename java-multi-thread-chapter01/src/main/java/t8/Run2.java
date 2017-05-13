package t8;

public class Run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 mythread = new MyThread2();
		System.out.println("begin ="+System.currentTimeMillis());
		mythread.start();
		System.out.println("end ="+System.currentTimeMillis());


	}

}
