package twoStop;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		ThreadA athread = new ThreadA(service);
		athread.start();
		ThreadB bthread = new ThreadB(service);
		bthread.start();
	}

}
