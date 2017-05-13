package t15;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			MyThread thread= new MyThread();
			thread.start();
			thread.interrupt();
			System.out.println("end!");
	}
}
