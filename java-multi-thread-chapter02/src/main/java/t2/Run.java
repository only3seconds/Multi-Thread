package t2;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HasSelfPrivateNum numRef = new HasSelfPrivateNum();
	ThreadA athread = new ThreadA(numRef);
	athread.start();
	ThreadB bthread = new ThreadB(numRef);
	bthread.start();
	}

}
